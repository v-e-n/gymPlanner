import java.util.ArrayList;

public class WorkoutSet {

    ExerciseData exerciseSource = new ExerciseData();
    ArrayList<String> exerciseNames = new ArrayList<>();

    private String workoutType;
    private Profile profile;

    public WorkoutSet(String workoutType, Profile profile) {
        this.workoutType = workoutType;
        this.profile = profile;

        populateWorkoutSet();
    }

    void populateWorkoutSet() {

        for (int i = 0; i < exerciseSource.exercises.size(); i++) {

            Exercise currentExercise = exerciseSource.exercises.get(i);

            String targetMuscle = currentExercise.getTargetMuscle();

            boolean bodyTypeMatches =
                    currentExercise.getBodyTypeTarget()
                            .equalsIgnoreCase(profile.bodyType);

            boolean goalMatches =
                    currentExercise.getGoalTarget()
                            .equalsIgnoreCase(profile.bodyGoal);

            if (bodyTypeMatches && goalMatches) {

                if (workoutType.equalsIgnoreCase("Upper")
                        && isUpperBody(targetMuscle)) {

                    exerciseNames.add(currentExercise.getExerciseName());

                } else if (workoutType.equalsIgnoreCase("Lower")
                        && isLowerBody(targetMuscle)) {

                    exerciseNames.add(currentExercise.getExerciseName());

                } else if (workoutType.equalsIgnoreCase("Full Body")
                        && (isUpperBody(targetMuscle)
                        || isLowerBody(targetMuscle))) {

                    exerciseNames.add(currentExercise.getExerciseName());
                }
            }
        }
    }

    private boolean isUpperBody(String muscle) {

        return muscle.equalsIgnoreCase("Chest")
                || muscle.equalsIgnoreCase("Triceps")
                || muscle.equalsIgnoreCase("Back")
                || muscle.equalsIgnoreCase("Shoulders")
                || muscle.equalsIgnoreCase("Biceps");
    }

    private boolean isLowerBody(String muscle) {

        return muscle.equalsIgnoreCase("Quadriceps")
                || muscle.equalsIgnoreCase("Hamstrings")
                || muscle.equalsIgnoreCase("Glutes")
                || muscle.equalsIgnoreCase("Calves");
    }

    public void displayWorkout() {

        System.out.println(workoutType + " Workout:");

        for (String exercise : exerciseNames) {
            System.out.println("- " + exercise);
        }
    }
}