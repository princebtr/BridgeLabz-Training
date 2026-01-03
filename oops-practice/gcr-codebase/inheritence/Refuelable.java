// Interface
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle3 {
    int maxSpeed;
    String model;

    Vehicle3(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle(120, "Generic Vehicle");

        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

        v.displayInfo();
        System.out.println();

        ev.displayInfo();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle3 {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Electric vehicle is charging");
    }
}

// Subclass PetrolVehicle
class PetrolVehicle extends Vehicle3 implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is refueling");
    }
}
