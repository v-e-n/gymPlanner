import java.util.ArrayList;

public class ExerciseData {

    ArrayList<Exercise> exercises = new ArrayList<>();
    
    ExerciseData(){

            // CHEST
                exercises.add(new Exercise(1001, "Push Up", "Normal", "Maintenance", false, 3, 12, 0, 4, "Chest"));
                exercises.add(new Exercise(1002, "Bench Press", "Normal", "Gain Muscle", false, 4, 10, 0, 6, "Chest"));
                exercises.add(new Exercise(1003, "Incline Bench Press", "Normal", "Gain Muscle", false, 4, 10, 0, 7, "Chest"));
                exercises.add(new Exercise(1004, "Chest Fly", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Chest"));
                exercises.add(new Exercise(1005, "Decline Push Up", "Normal", "Weight Loss", false, 3, 10, 0, 5, "Chest"));
               
            // TRICEPS
                exercises.add(new Exercise(1006, "Tricep Pushdown", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Triceps"));
                exercises.add(new Exercise(1007, "Tricep Dip", "Normal", "Gain Muscle", false, 3, 10, 0, 6, "Triceps"));
                exercises.add(new Exercise(1008, "Close Grip Push Up", "Normal", "Maintenance", false, 3, 12, 0, 5, "Triceps"));
                exercises.add(new Exercise(1009, "Overhead Tricep Extension", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Triceps"));
                exercises.add(new Exercise(1010, "Diamond Push Up", "Normal", "Gain Muscle", false, 3, 10, 0, 7, "Triceps"));

            // SHOULDERS
                exercises.add(new Exercise(1011, "Shoulder Press", "Normal", "Gain Muscle", false, 4, 10, 0, 6, "Shoulders"));
                exercises.add(new Exercise(1012, "Lateral Raise", "Normal", "Gain Muscle", false, 3, 12, 0, 4, "Shoulders"));
                exercises.add(new Exercise(1013, "Front Raise", "Normal", "Gain Muscle", false, 3, 12, 0, 4, "Shoulders"));
                exercises.add(new Exercise(1014, "Arnold Press", "Normal", "Gain Muscle", false, 3, 10, 0, 7, "Shoulders"));
                exercises.add(new Exercise(1015, "Pike Push Up", "Normal", "Maintenance", false, 3, 10, 0, 6, "Shoulders"));

            // BACK
                exercises.add(new Exercise(1016, "Pull Up", "Normal", "Gain Muscle", false, 3, 8, 0, 8, "Back"));
                exercises.add(new Exercise(1017, "Lat Pulldown", "Normal", "Gain Muscle", false, 4, 10, 0, 6, "Back"));
                exercises.add(new Exercise(1018, "Barbell Row", "Normal", "Gain Muscle", false, 4, 10, 0, 7, "Back"));
                exercises.add(new Exercise(1019, "Seated Cable Row", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Back"));
                exercises.add(new Exercise(1020, "Dumbbell Row", "Normal", "Maintenance", false, 3, 10, 0, 5, "Back"));

            // BICEPS
                exercises.add(new Exercise(1021, "Bicep Curl", "Normal", "Gain Muscle", false, 3, 12, 0, 4, "Biceps"));
                exercises.add(new Exercise(1022, "Hammer Curl", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Biceps"));
                exercises.add(new Exercise(1023, "Preacher Curl", "Normal", "Gain Muscle", false, 3, 10, 0, 5, "Biceps"));
                exercises.add(new Exercise(1024, "Concentration Curl", "Normal", "Gain Muscle", false, 3, 10, 0, 4, "Biceps"));
                exercises.add(new Exercise(1025, "Cable Curl", "Normal", "Maintenance", false, 3, 12, 0, 4, "Biceps"));

            // ABS
                exercises.add(new Exercise(1026, "Crunch", "Normal", "Weight Loss", false, 3, 15, 0, 3, "Abs"));
                exercises.add(new Exercise(1027, "Sit Up", "Normal", "Weight Loss", false, 3, 15, 0, 4, "Abs"));
                exercises.add(new Exercise(1028, "Plank", "Normal", "Maintenance", true, 3, 0, 30, 4, "Abs"));
                exercises.add(new Exercise(1029, "Bicycle Crunch", "Normal", "Weight Loss", false, 3, 15, 0, 5, "Abs"));
                exercises.add(new Exercise(1030, "Leg Raise", "Normal", "Weight Loss", false, 3, 12, 0, 5, "Abs"));

            // QUADS
                exercises.add(new Exercise(1031, "Bodyweight Squat", "Normal", "Weight Loss", false, 3, 15, 0, 4, "Quads"));
                exercises.add(new Exercise(1032, "Barbell Squat", "Normal", "Gain Muscle", false, 4, 10, 0, 8, "Quads"));
                exercises.add(new Exercise(1033, "Leg Press", "Normal", "Gain Muscle", false, 4, 10, 0, 7, "Quads"));
                exercises.add(new Exercise(1034, "Walking Lunge", "Normal", "Weight Loss", false, 3, 12, 0, 5, "Quads"));
                exercises.add(new Exercise(1035, "Leg Extension", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Quads"));

            // HAMSTRINGS
                exercises.add(new Exercise(1036, "Romanian Deadlift", "Normal", "Gain Muscle", false, 4, 10, 0, 8, "Hamstrings"));
                exercises.add(new Exercise(1037, "Lying Leg Curl", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Hamstrings"));
                exercises.add(new Exercise(1038, "Seated Leg Curl", "Normal", "Gain Muscle", false, 3, 12, 0, 5, "Hamstrings"));
                exercises.add(new Exercise(1039, "Good Morning", "Normal", "Gain Muscle", false, 3, 10, 0, 7, "Hamstrings"));
                exercises.add(new Exercise(1040, "Single Leg Deadlift", "Normal", "Maintenance", false, 3, 10, 0, 6, "Hamstrings"));

            // GLUTES
                exercises.add(new Exercise(1041, "Glute Bridge", "Normal", "Gain Muscle", false, 3, 15, 0, 4, "Glutes"));
                exercises.add(new Exercise(1042, "Hip Thrust", "Normal", "Gain Muscle", false, 4, 10, 0, 6, "Glutes"));
                exercises.add(new Exercise(1043, "Glute Kickback", "Normal", "Gain Muscle", false, 3, 12, 0, 4, "Glutes"));
                exercises.add(new Exercise(1044, "Bulgarian Split Squat", "Normal", "Gain Muscle", false, 3, 10, 0, 7, "Glutes"));
                exercises.add(new Exercise(1045, "Step Up", "Normal", "Weight Loss", false, 3, 12, 0, 5, "Glutes"));

            // CALVES
                exercises.add(new Exercise(1046, "Standing Calf Raise", "Normal", "Gain Muscle", false, 3, 15, 0, 3, "Calves"));
                exercises.add(new Exercise(1047, "Seated Calf Raise", "Normal", "Gain Muscle", false, 3, 15, 0, 4, "Calves"));
                exercises.add(new Exercise(1048, "Single Leg Calf Raise", "Normal", "Maintenance", false, 3, 12, 0, 4, "Calves"));
                exercises.add(new Exercise(1049, "Jump Rope", "Normal", "Weight Loss", true, 3, 0, 60, 5, "Calves"));
                exercises.add(new Exercise(1050, "Calf Jump", "Normal", "Weight Loss", false, 3, 15, 0, 5, "Calves"));
    }

    void traverseExercise(){

        for(int i = 0; i < exercises.size(); i++){
                Exercise currentExercise = exercises.get(i);
                System.out.println(currentExercise.getExerciseName());
        }
    }

    void searchExercise(String searchName){

        boolean flag = false;
       for(int i = 0; i < exercises.size(); i++){
            Exercise currentExercise = exercises.get(i);
            if(searchName.equals(currentExercise.getExerciseName())){
                System.out.println(currentExercise.getExerciseName());
                flag = true;
                break;
            }   
       }
        if(flag == false){
                System.out.println("No excercise");
        } 
    }

    void searchMuscleGroup(String searchMuscle){
        boolean flag = false;
        for(int i = 0; i < exercises.size(); i++){
            Exercise muscleGroup = exercises.get(i);

            if(searchMuscle.equals(muscleGroup.getTargetMuscle())){
                System.out.println(muscleGroup);
                flag = true;
            }
        }

        if(flag == false){
            System.out.println("Cannot find what are you looking for!");  
        }
    }
    void searchDiffultyTarget(String difficulty, String targetBody){
        boolean flag = false;
        
        for(int i = 0; i < exercises.size(); i++){
            Exercise find = exercises.get(i);
            if(difficulty.equals(find.getBaseDifficulty()) && targetBody.equals(find.getBodyTypeTarget())){
                System.out.println(find.getBaseDifficulty() + find.getBodyTypeTarget());
                flag = true;
            }
        }
         if(flag == false){
              System.out.println("Cannot find what are you looking for!");  
            }
    }
    
    void searchBodyTarget(String bodyType, String target){
        boolean flag = false;

        for(int i = 0; i < exercises.size(); i++){
            Exercise find = exercises.get(i);

            if(bodyType.equals(find.getBodyTypeTarget()) && target.equals(find.getGoalTarget())){
                System.out.println(find);
                flag = true;
            }
        }

        if(flag == false){
            System.out.println("Cannot find what are you looking for!");
        }
    }

    void sortDifficulty(){
        
        
        int smallest;
        

        for(int i = 0; i < exercises.size(); i++){
            smallest = i;

            for(int j = i + 1; j < exercises.size(); j++){
                if(exercises.get(j).getBaseDifficulty() < exercises.get(smallest).getBaseDifficulty()){
                    smallest = j;
                }
                
            }
            Exercise temp = exercises.get(i);
            exercises.set(i, exercises.get(smallest));
            exercises.set(smallest, temp);


        }

    }

}
