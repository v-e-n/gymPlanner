import java.util.Hashtable;
import java.util.Scanner;

class FirstStep{

    Hashtable<String, Account> ht = new Hashtable<>();
    Scanner input = new Scanner(System.in);
    class Account{


        String pass;
        String email;

        Account(String email, String pass){
            this.pass = pass;
            this.email = email;

        }

        private String getEmail(){
                return email;
        }

        private String getPass(){
                return pass;
        }
    }
    public boolean signUp(){
        String userEmail;
        String pass;
        boolean account = false;

        System.out.print("Enter your email");
        userEmail = input.nextLine();
        if(!ht.containsKey(userEmail)){

            System.out.println("Enter your password");
            pass = input.nextLine();

            while(!pass.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,}$")){
                System.out.println("Weak password");
                pass = input.nextLine();
            }
            
            Account newAccount = new Account(userEmail, pass);
            ht.put(userEmail, newAccount);
            account = true;
        }
        
        return account;

    }

    void logIn(){
        String userEmail;
        String userPass;
        String pass;
        int loginCount = 5;
        int counter = 1;

        System.out.println("Enter your email");
        userEmail = input.nextLine();

        System.out.println("Enter your password");
        userPass = input.nextLine();

        Account account = ht.get(userEmail);
        

        if(account == null){
            System.out.println("Account does not exists");
        }
        else{
            pass = account.getPass();
            
            while(!pass.equals(userPass) && counter < loginCount){
                System.out.println("Incorrect Password");
                System.out.println("Attempts remaining: " + (loginCount - counter));

                userPass = input.nextLine();
                counter++;

                if(pass.equals(userPass)){
                    System.out.println("Log-in Succesfully");
                } else{
                    System.out.println("Account Locked try again later");
                }
            }
            
        }
    }

    void profile(){
        int height;
        int weight;
        int bmi;

        

    }
}


//TO DO ADMIN ACCOUNT
// WHAT ARE OTHER OPTIONS NOT TO HAVE ADMIN ACCOUNT BUT IT WILL MONITOR THE DATA OR THE SYSTEMS

/*
One thing I'd have you add next

Your login currently handles:

❌ Account doesn't exist
✅ Password is correct

But it doesn't handle:

❌ Account exists, but password is wrong
 */


