import java.util.ArrayList;
import java.util.HashMap;

public class ExerciseGraph {

    private HashMap<String, ArrayList<String>> graph;

    public ExerciseGraph() {
        graph = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(String vertex) {

        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>());
        }
    }

    // Add a connection between two vertices
    public void addEdge(String exercise, String muscle) {

        addVertex(exercise);
        addVertex(muscle);

        graph.get(exercise).add(muscle);
    }

    // Display the graph
    public void displayGraph() {

        for (String vertex : graph.keySet()) {

            System.out.print(vertex + " -> ");

            for (String connection : graph.get(vertex)) {
                System.out.print(connection + " ");
            }

            System.out.println();
        }
    }

    // Search for an exercise or muscle
    public boolean contains(String vertex) {

        return graph.containsKey(vertex);
    }

    // Get connections of a vertex
    public void showConnections(String vertex) {

        if (!graph.containsKey(vertex)) {
            System.out.println("Vertex not found.");
            return;
        }

        System.out.println(vertex + " is connected to:");

        for (String connection : graph.get(vertex)) {
            System.out.println("- " + connection);
        }
    }
}