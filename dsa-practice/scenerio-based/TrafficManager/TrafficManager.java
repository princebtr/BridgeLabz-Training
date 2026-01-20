package TrafficManager;

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
