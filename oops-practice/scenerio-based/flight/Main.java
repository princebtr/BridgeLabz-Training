package flight;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Flight Booking System");
		FlightBookingSystem fbs = new FlightBookingSystem();
		fbs.addFlight(new Flight("AirIndia", "Delhi", "Mumbai", 5000));
        fbs.addFlight(new Flight("SpiceJet", "Patna", "Gaya", 3000));
        fbs.addFlight(new Flight("Akasha", "Chennai", "Aurangabad", 9000));
		System.out.println("Enter Name :");
		String name = input.nextLine();
		System.out.println("Enter age :");
		int age = input.nextInt();
		User u1 = new User(name,age);
		FlightBookingSystem f = new FlightBookingSystem();
		f.bookFlight(u1);
	}
}