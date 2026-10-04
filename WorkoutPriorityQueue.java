import java.util.PriorityQueue;

public class WorkoutPriorityQueue {

    private PriorityQueue<Exercise> workoutQueue;

    public WorkoutPriorityQueue() {

        workoutQueue = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                b.getBaseDifficulty(),
                a.getBaseDifficulty()
            )
        );
    }

    // Add an exercise
    public void addExercise(Exercise exercise) {

        workoutQueue.offer(exercise);
    }

    // Get the highest-priority exercise
    public Exercise peekHighestPriority() {

        return workoutQueue.peek();
    }

    // Remove the highest-priority exercise
    public Exercise removeHighestPriority() {

        return workoutQueue.poll();
    }

    // Check if empty
    public boolean isEmpty() {

        return workoutQueue.isEmpty();
    }

    // Display the priority queue
    public void displayQueue() {

        while (!workoutQueue.isEmpty()) {

            Exercise exercise = workoutQueue.poll();

            System.out.println(
                exercise.getExerciseName()
                + " - Difficulty: "
                + exercise.getBaseDifficulty()
            );
        }
    }
}