import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

class FirstStep {

    Hashtable<String, Account> ht = new Hashtable<>();

    Scanner input = new Scanner(System.in);

    private final String FILE_NAME = "accounts.csv";

    
    class Account {

        String pass;
        String email;

        // User's personal information
        Profile profile;

        // Upcoming workouts
        WorkoutSetQueue workoutQueue;

        // Completed workouts
        WorkoutHistoryStack workoutHistory;

        Account(String email, String pass) {

            this.email = email;
            this.pass = pass;

            // Initially no profile or workout data
            this.profile = null;
            this.workoutQueue = null;
            this.workoutHistory = new WorkoutHistoryStack();
        }

        private String getEmail() {
            return email;
        }

        private String getPass() {
        return pass;
        }
    }



    // Constructor
    FirstStep() {
        loadAccounts();
    }


    void createWorkoutQueue(Account account) {

        // Do not recreate the queue if the account already has one
        if (account.workoutQueue != null) {
            return;
        }

        Profile profile = account.profile;

        WorkoutSet upper = new WorkoutSet("Upper", profile);
        WorkoutSet lower = new WorkoutSet("Lower", profile);
        WorkoutSet fullBody = new WorkoutSet("Full Body", profile);

        account.workoutQueue = new WorkoutSetQueue();

        account.workoutQueue.addWorkout(upper);
        account.workoutQueue.addWorkout(lower);
        account.workoutQueue.addWorkout(fullBody);

        System.out.println("\nWorkout queue created.");
        account.workoutQueue.displayQueue();
    }



    public boolean signUp() {

        String userEmail;
        String pass;

        System.out.println("Enter your email:");
        userEmail = input.nextLine();

        if (ht.containsKey(userEmail)) {
            System.out.println("Account already exists.");
            return false;
        }

        System.out.println("Enter your password:");
        pass = input.nextLine();

        while (!pass.matches(
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,}$")) {

            System.out.println("Weak password. Try again:");
            pass = input.nextLine();
        }


        Account newAccount = new Account(userEmail, pass);

        // Create profile
        newAccount.profile = new Profile();

        // Generate the first workout queue
        createWorkoutQueue(newAccount);

        // Store account in Hashtable
        ht.put(userEmail, newAccount);

        // Save all accounts to CSV
        saveAccounts();

        System.out.println("Account created successfully.");

        return true;
    }

    void logIn() {

        String userEmail;
        String userPass;

        int loginCount = 5;
        int counter = 1;

        System.out.println("Enter your email:");
        userEmail = input.nextLine();

        Account account = ht.get(userEmail);

        if (account == null) {

            System.out.println("Account does not exist.");
            return;
        }

        while (counter <= loginCount) {

            System.out.println("Enter your password:");
            userPass = input.nextLine();

            if (account.getPass().equals(userPass)) {

                System.out.println("Log-in Successfully.");

                if (account.profile != null) {

                    System.out.println("\nProfile found.");
                    System.out.println("BMI: " + account.profile.bmi);
                    System.out.println("Body Type: " + account.profile.bodyType);
                    System.out.println("Body Goal: " + account.profile.bodyGoal);

                    createWorkoutQueue(account);

                } else {

                    System.out.println("No profile found.");
                }

                return;

            } else {

                System.out.println("Incorrect Password.");

                if (counter < loginCount) {

                    System.out.println(
                            "Attempts remaining: "
                            + (loginCount - counter)
                    );
                }

                counter++;
            }
        }

        System.out.println("Account Locked. Try again later.");
    }

    // =========================
    // SAVE ACCOUNTS TO CSV
    // =========================

    void saveAccounts() {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME))) {

            // CSV header
            writer.write("email,password,height,weight,bmi,bodyType,bodyGoal");
            writer.newLine();

            for (Account account : ht.values()) {

                if (account.profile == null) {
                    continue;
                }

                Profile profile = account.profile;

                writer.write(
                        csvValue(account.email) + ","
                        + csvValue(account.pass) + ","
                        + profile.height + ","
                        + profile.weight + ","
                        + profile.bmi + ","
                        + csvValue(profile.bodyType) + ","
                        + csvValue(profile.bodyGoal)
                );

                writer.newLine();
            }

            System.out.println("Accounts saved.");

        } catch (IOException e) {

            System.out.println("Error saving accounts.");
            System.out.println(e.getMessage());
        }
    }

    // =========================
    // LOAD ACCOUNTS FROM CSV
    // =========================

    void loadAccounts() {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            // Skip CSV header
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = parseCSVLine(line);

                if (data.length != 7) {
                    System.out.println("Skipping invalid account record.");
                    continue;
                }

                String email = data[0];
                String password = data[1];

                float height = Float.parseFloat(data[2]);
                float weight = Float.parseFloat(data[3]);
                double bmi = Double.parseDouble(data[4]);

                String bodyType = data[5];
                String bodyGoal = data[6];

                Account account = new Account(email, password);

                account.profile = new Profile(
                        height,
                        weight,
                        bmi,
                        bodyType,
                        bodyGoal
                );

                ht.put(email, account);
            }

            System.out.println("Accounts loaded.");

        } catch (IOException e) {

            // File does not exist yet.
            // This is normal the first time the program runs.

            System.out.println("No existing accounts found.");
            System.out.println("A new accounts.csv file will be created.");
        }
    }

    // =========================
    // CSV VALUE HANDLER
    // =========================

    private String csvValue(String value) {

        if (value == null) {
            return "";
        }

        // Escape quotation marks
        value = value.replace("\"", "\"\"");

        // Put value inside quotation marks
        return "\"" + value + "\"";
    }

    // =========================
    // CSV LINE PARSER
    // =========================

    private String[] parseCSVLine(String line) {

        java.util.ArrayList<String> values =
                new java.util.ArrayList<>();

        StringBuilder current = new StringBuilder();

        boolean insideQuotes = false;

        for (int i = 0; i < line.length(); i++) {

            char character = line.charAt(i);

            if (character == '"') {

                // Handle escaped quotation marks
                if (insideQuotes
                        && i + 1 < line.length()
                        && line.charAt(i + 1) == '"') {

                    current.append('"');
                    i++;

                } else {

                    insideQuotes = !insideQuotes;
                }

            } else if (character == ',' && !insideQuotes) {

                values.add(current.toString());
                current.setLength(0);

            } else {

                current.append(character);
            }
        }

        values.add(current.toString());

        return values.toArray(new String[0]);
    }
}

