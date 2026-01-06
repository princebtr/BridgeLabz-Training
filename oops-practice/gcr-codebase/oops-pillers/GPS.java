//Problem Statement:  Ride-Hailing Application
//Description: Develop a ride-hailing application:
//Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
//Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
//Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
//Use an interface GPS with methods getCurrentLocation() and updateLocation().
//Secure driver and vehicle details using encapsulation.
//Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.

public interface GPS {
	void getCurrentLocation();
	void updateLocation(String location);
//	String location;
}
abstract class Vehicle{
	private int vehicleId;
	private String driverName;
	private double ratePerKm;
	
	Vehicle(int vehicleId, String driverName, double ratePerKm){
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}
//	Getter method
	public int getVehicleId() {
		return vehicleId;
	}
	public String getDriverName() {
		return driverName;
	}
	public double getRatePerKm() {
		return ratePerKm;
	}
//	Setter method
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setRatePerKm(double ratePerKm) {
		this.ratePerKm = ratePerKm;
	}
	
	abstract void calculateFare(double distance);
	
	void getVehicleDetails() {
		System.out.println("Vehicle Id : "+vehicleId+"\nDriver Name : "+driverName+"\nRate per KM : "+ratePerKm);
	}
}

class Car extends Vehicle implements GPS{
	String location;
	Car(int vehicleId, String driverName, double ratePerKm, String location) {
		super(vehicleId, driverName, ratePerKm);
		this.location = location;
	}

	@Override
	public void getCurrentLocation() {
		System.out.println("Location : "+location);
	}

	@Override
	public void updateLocation(String location) {
		this.location = location;
	}

	@Override
	void calculateFare(double distance) {
		System.out.println("Total Fare of Car : "+(distance*getRatePerKm()));
	}	
}

class Bike extends Vehicle implements GPS{
	String location;
	Bike(int vehicleId, String driverName, double ratePerKm, String location) {
		super(vehicleId, driverName, ratePerKm);
		this.location = location;
	}

	@Override
	public void getCurrentLocation() {
		System.out.println("Location : "+location);
	}

	@Override
	public void updateLocation(String location) {
		this.location = location;
	}

	@Override
	void calculateFare(double distance) {
		System.out.println("Total Fare of Bike : "+(distance*getRatePerKm()));
	}	
}

class Auto extends Vehicle implements GPS{
	String location;
	Auto(int vehicleId, String driverName, double ratePerKm, String location) {
		super(vehicleId, driverName, ratePerKm);
		this.location = location;
	}

	@Override
	public void getCurrentLocation() {
		System.out.println("Location : "+location);
	}

	@Override
	public void updateLocation(String location) {
		this.location = location;
	}

	@Override
	void calculateFare(double distance) {
		System.out.println("Total Fare of Auto : "+(distance*getRatePerKm()));
	}	
}
class RideHailingApp {

    // Polymorphic method
    static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        vehicle.calculateFare(distance);
    }

    public static void main(String[] args) {

        Vehicle car = new Car(101, "Amit", 15.0, "Delhi");
        Vehicle bike = new Bike(102, "Rahul", 8.0, "Noida");
        Vehicle auto = new Auto(103, "Suresh", 10.0, "Gurgaon");

        double distance = 10;

        calculateRideFare(car, distance);
        calculateRideFare(bike, distance);
        calculateRideFare(auto, distance);
    }
}

