public class ExerciseBST {

    private Node root;

    private class Node {

        Exercise exercise;
        Node left;
        Node right;

        Node(Exercise exercise) {
            this.exercise = exercise;
            this.left = null;
            this.right = null;
        }
    }

    // Insert an exercise into the BST
    public void insert(Exercise exercise) {

        root = insertNode(root, exercise);
    }

    private Node insertNode(Node current, Exercise exercise) {

        if (current == null) {
            return new Node(exercise);
        }

        if (exercise.getExerciseId() < current.exercise.getExerciseId()) {

            current.left = insertNode(current.left, exercise);

        } else if (exercise.getExerciseId() > current.exercise.getExerciseId()) {

            current.right = insertNode(current.right, exercise);
        }

        return current;
    }

    // Search for an exercise by ID
    public Exercise search(int exerciseId) {

        Node current = root;

        while (current != null) {

            if (exerciseId == current.exercise.getExerciseId()) {
                return current.exercise;
            }

            if (exerciseId < current.exercise.getExerciseId()) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    // Inorder traversal
    public void inorder() {

        inorderTraversal(root);
    }

    private void inorderTraversal(Node current) {

        if (current == null) {
            return;
        }

        inorderTraversal(current.left);

        System.out.println(current.exercise);

        inorderTraversal(current.right);
    }

    // Preorder traversal
    public void preorder() {

        preorderTraversal(root);
    }

    private void preorderTraversal(Node current) {

        if (current == null) {
            return;
        }

        System.out.println(current.exercise);

        preorderTraversal(current.left);
        preorderTraversal(current.right);
    }

    // Postorder traversal
    public void postorder() {

        postorderTraversal(root);
    }

    private void postorderTraversal(Node current) {

        if (current == null) {
            return;
        }

        postorderTraversal(current.left);
        postorderTraversal(current.right);

        System.out.println(current.exercise);
    }

    // Check if BST is empty
    public boolean isEmpty() {

        return root == null;
    }
}