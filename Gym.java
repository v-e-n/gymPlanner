public class Gym {

    public static void main(String[] args){

        ExerciseData trial = new ExerciseData();
        ExerciseDataHash trialHash = new ExerciseDataHash();
        
        trialHash.populateHashMap();
        trialHash.searchExerciseHashMap("Push Up");

    } 
    
}
