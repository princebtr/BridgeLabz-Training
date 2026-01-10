//Problem Statement:  Vehicle Rental Application (CRUD)
//● Concepts: Vehicle, Bike, Car, Truck, Customer.
//● Access Modifiers: protected fields.
//● Interface: IRentable with CalculateRent(int days).

import java.util.*;
public interface VehicleRentalApplication {
	double calculateRent(int days);
//	boolean rentable();
}

class UnderAgeException extends RuntimeException{
	public UnderAgeException(String message) {
		super(message);
	}
}

class Vehicle {
	private static int counter = 1000;
	private int id;
	private String model;
	private double rentPerDay;
	private boolean isAvailable;

	public Vehicle(String model, double rentPerDay) {
		this.id = counter++;
		this.model = model;
		this.rentPerDay = rentPerDay;
		this.isAvailable = true;
	}

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public double getRent() {
		return rentPerDay;
	}

	public void setRent(double value) {
		this.rentPerDay = value;
	}

	public void rent() {
		isAvailable = false;
	}

	public void returning() {
		isAvailable = true;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
}

class Car extends Vehicle implements VehicleRentalApplication {
	private int seat;

	public Car(String model, double rentPerDay, int seat) {
		super(model, rentPerDay);
		this.seat = seat;
	}

	@Override
	public double calculateRent(int days) {
		return days*getRent();
	}
}

class Bike extends Vehicle implements VehicleRentalApplication {
	private boolean isGear;

	public Bike(String model, double rentPerDay, boolean isGear) {
		super(model, rentPerDay);
		this.isGear = isGear;
	}

	@Override
	public double calculateRent(int days) {
		return days*getRent();
	}
}

class Truck extends Vehicle implements VehicleRentalApplication {
	private int load;

	public Truck(String model, double rentPerDay, int load) {
		super(model, rentPerDay);
		this.load =load;
	}

	@Override
	public double calculateRent(int days) {
		return days*getRent();
	}
}

class User {
	private String name;
	private int age;
	public User(String name, int age) {
		if(age < 18) {
			throw new UnderAgeException("Rent Denied!!! You are Under age");
		}
		this.name = name;
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

class Rent {
	private List<Vehicle> vehicleList = new ArrayList<>();
	private Scanner input = new Scanner(System.in);

	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}

	public void showVehicles(Class<?> type) {
		for (Vehicle v : vehicleList) {
			if (type.isInstance(v) && v.isAvailable()) {
				System.out.println(v.getId() + " - " + v.getModel() + " | Rent/day: " + v.getRent());
			}
		}
	}

	public void rentVehicle(User u) {
		boolean exit = false;

		while (!exit) {
			System.out.println("\nVehicle Rental Service");
			System.out.println("1. Bike\n2. Car\n3. Truck\n4. Exit");
			int choice = input.nextInt();

			if (choice == 4) {
				exit = true;
				continue;
			}

			System.out.println("Enter number of days:");
			int days = input.nextInt();

			Class<?> type = null;

			switch (choice) {
				case 1: type = Bike.class; break;
				case 2: type = Car.class; break;
				case 3: type = Truck.class; break;
				default:
					System.out.println("Invalid choice");
					continue;
			}

			showVehicles(type);
			System.out.println("Enter Vehicle ID:");
			int vid = input.nextInt();

			for (Vehicle v : vehicleList) {
				if (v.getId() == vid && v.isAvailable() && type.isInstance(v)) {
					VehicleRentalApplication vr = (VehicleRentalApplication) v;
					double bill = vr.calculateRent(days);
					v.rent();
					System.out.println("Vehicle booked successfully!");
					System.out.println("Total Rent = ₹" + bill);
					return;
				}
			}

			System.out.println("Vehicle not available!");
		}
	}
}

// Main Class
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = input.next();
		System.out.println("Enter your age :");
		int age = input.nextInt();
		try {
			User user = new User(name, age);

			Rent rentService = new Rent();

			// Adding Vehicles
			rentService.addVehicle(new Bike("Honda Shine", 300, true));
			rentService.addVehicle(new Car("Swift", 1200, 5));
			rentService.addVehicle(new Truck("Tata Truck", 2500, 10));

			rentService.rentVehicle(user);

		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
