package TrafficManager;

// Node for Circular Linked List 
class VehicleNode {
    String vehicleNumber;
    VehicleNode next;

    VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}