import java.util.HashMap;



public class ExerciseDataHash {

    HashMap<String, Exercise> map = new HashMap<>();
    HashMap<Integer, Exercise> mapInt = new HashMap<>();
    ExerciseData exerciseData = new ExerciseData();
    


    void populateHashMap(){
        
        String key;
        int keyInt;

        for(int i = 0; i < exerciseData.exercises.size(); i++){
            Exercise currentExercise = exerciseData.exercises.get(i);
            key = currentExercise.getExerciseName();
            keyInt = currentExercise.getExerciseId();
            map.put(key, currentExercise);
            mapInt.put(keyInt, currentExercise);

        }

    }

    void searchExerciseHashMap(String searchingExerciseString){
        Exercise result = map.get(searchingExerciseString);
        

        if(result == null){
            System.out.println("It doesnt exist");
        } else {
            System.out.println(result);
        }
    }

    void searchExerciseIdHashMap(int exerciseId){
        Exercise result = mapInt.get(exerciseId);

        if(result == null){
            System.out.println("It doesnt exist");
        } else {
            System.out.println(result);
        }

    }

   
    
}
