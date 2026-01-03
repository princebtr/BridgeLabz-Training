//Problem Statement: Vehicle and Transport System
//Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
//Tasks:
//Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
//Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
//Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
//Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.

// Superclass
public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to be overridden
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
//    main method
    public static void main(String[] args) {
        // Polymorphism: Vehicle reference holding different objects
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(140, "Petrol", true);

        // Dynamic Method Dispatch
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }

}

// Subclass Car
class Car extends Vehicle {
    private int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("\nCar Details:");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("\nTruck Details:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasKickStart;

    Motorcycle(int maxSpeed, String fuelType, boolean hasKickStart) {
        super(maxSpeed, fuelType);
        this.hasKickStart = hasKickStart;
    }

    @Override
    void displayInfo() {
        System.out.println("\nMotorcycle Details:");
        super.displayInfo();
        System.out.println("Kick Start Available: " + hasKickStart);
    }
}
