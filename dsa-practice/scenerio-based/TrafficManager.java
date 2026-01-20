import java.util.LinkedList;
import java.util.Queue;

// Node for Circular Linked List 
class VehicleNode {
    String vehicleNumber;
    VehicleNode next;

    VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}

//  Circular Linked List 
class Roundabout {
    private VehicleNode tail;

    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(vehicleNumber + " entered roundabout");
    }

    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode head = tail.next;

        if (head == tail) {
            System.out.println(head.vehicleNumber + " exited roundabout");
            tail = null;
        } else {
            System.out.println(head.vehicleNumber + " exited roundabout");
            tail.next = head.next;
        }
    }

    public void printState() {
        if (tail == null) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode temp = tail.next;
        System.out.print("Roundabout State: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to start)");
    }
}

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

//  Main Manager 
public class TrafficManager {
    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(3);

        queue.enqueue("MH12A101");
        queue.enqueue("MH12A102");
        queue.enqueue("MH12A103");
        queue.enqueue("MH12A104");

        while (!queue.isEmpty()) {
            String vehicle = queue.dequeue();
            if (vehicle != null)
                roundabout.addVehicle(vehicle);
        }

        roundabout.printState();

        roundabout.removeVehicle();
        roundabout.printState();
    }
}
