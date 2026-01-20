package TrafficManager;
import java.util.LinkedList;
import java.util.Queue;

//  Queue with overflow & underflow handling 
class VehicleQueue {
    private Queue<String> queue = new LinkedList<>();
    private int capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
    }

    public void enqueue(String vehicle) {
        if (queue.size() == capacity) {
            System.out.println("Queue Overflow: " + vehicle + " cannot enter");
            return;
        }
        queue.add(vehicle);
        System.out.println(vehicle + " added to waiting queue");
    }

    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow: No vehicles waiting");
            return null;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
