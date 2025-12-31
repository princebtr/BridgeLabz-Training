// Problem Statement: Create a Vehicle class to manage the details of vehicles:
// Instance Variables: ownerName, vehicleType.
// Class Variable: registrationFee (fixed for all vehicles).
// Methods:
// An instance method displayVehicleDetails() to display owner and vehicle details.
// A class method updateRegistrationFee() to change the registration fee.

class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType + " | Fee: ₹" + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
