import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    // Constructor
    public QueueUsingStacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int value) {
        inStack.push(value);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        // Transfer elements if outStack is empty
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        return outStack.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        return outStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
