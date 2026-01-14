import java.util.Stack;

public class SortStackUsingRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();

            // Sort remaining stack
            sortStack(stack);

            // Insert the removed element in sorted order
            insertSorted(stack, top);
        }
    }

    // Function to insert an element in sorted order
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base condition: stack is empty or top element <= element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursive call
        insertSorted(stack, element);

        // Push the element back
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements into the stack
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        // Sort the stack
        sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);
    }
}
