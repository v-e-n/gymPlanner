public class Gym {

    public static void main(String[] args){

        ExerciseData trial = new ExerciseData();
        ExerciseDataHash trialHash = new ExerciseDataHash();
        WorkoutSet trialWorkoutSet = new WorkoutSet();
        
        //trialHash.populateHashMap();
        //trialHash.searchExerciseHashMap("Push Up");

        trialWorkoutSet.populateExerciseName();
        trialWorkoutSet.workoutSetTest("Push Up");

    } 
    
}
