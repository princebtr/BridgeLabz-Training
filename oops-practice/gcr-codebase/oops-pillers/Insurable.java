//Problem Statement: Vehicle Rental System
//Description: Design a system to manage vehicle rentals:
//Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
//Add an abstract method calculateRentalCost(int days).
//Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
//Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
//Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
//Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

import java.util.*;

interface Insurable {
	void calculateInsurance();
	void getInsuranceDetails();
}

abstract class Vehicle{
	private String vehicleNumber;
	private String type;
	private double rentalRate;
//	Constructor
	Vehicle(String vehicleNumber, String type, double rentalRate){
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}
//	Setter Methods
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
//	Getter Methods
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	double insuranceAmount;
	Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
		super(vehicleNumber,"Car",rentalRate);
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	@Override
	double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
	@Override
	public void calculateInsurance() {
		insuranceAmount = getRentalRate() * 0.10;
	}
	@Override
	public void getInsuranceDetails() {
		System.out.println("Car Insurance Amount : "+insuranceAmount);
	}
}

class Bike extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	double insuranceAmount;
	Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
		super(vehicleNumber,"Bike",rentalRate);
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	@Override
	double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
	@Override
	public void calculateInsurance() {
		insuranceAmount = getRentalRate() * 0.05;
	}
	@Override
	public void getInsuranceDetails() {
		System.out.println("Bike Insurance Amount : "+insuranceAmount);
	}
}

class Truck extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	double insuranceAmount;
	Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
		super(vehicleNumber,"Truck",rentalRate);
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	@Override
	double calculateRentalCost(int days) {
		return (getRentalRate() * days) + 2000;
	}
	@Override
	public void calculateInsurance() {
		insuranceAmount = getRentalRate() * 0.15;
	}
	@Override
	public void getInsuranceDetails() {
		System.out.println("Truck Insurance Amount : "+insuranceAmount);
	}
}

class Main{
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		Vehicle v1 = new Car("BR01AB1234",3000,"CAR123");
		Vehicle v2 = new Bike("BR02CD5678",800,"BIKE456");
		Vehicle v3 = new Truck("BR03EF9012",6000,"TRUCK789");
		
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		
		int days = 5;
		
		for(Vehicle v : vehicles) {
			double rentalCost = v.calculateRentalCost(days);
			System.out.println("Vehicle Type : "+v.getType());
			System.out.println("Rental Cost for "+days+" days : "+rentalCost);
			
			if(v instanceof Insurable) {
				Insurable ins = (Insurable) v;
				ins.calculateInsurance();
				ins.getInsuranceDetails();
			}
		}
	}
}
