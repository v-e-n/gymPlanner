import java.util.ArrayDeque;
import java.util.Deque;

public class WorkoutHistoryStack {

    Deque<WorkoutSet> workoutHistory = new ArrayDeque<>();

    public void addCompletedWorkout(WorkoutSet workout) {
        workoutHistory.push(workout);
    }

    public WorkoutSet getLatestWorkout() {
        return workoutHistory.peek();
    }

    public WorkoutSet removeLatestWorkout() {
        return workoutHistory.pop();
    }

    public boolean isEmpty() {
        return workoutHistory.isEmpty();
    }

    public void displayHistory() {

        System.out.println("Workout History:");

        for (WorkoutSet workout : workoutHistory) {
            workout.displayWorkout();
        }
    }
}