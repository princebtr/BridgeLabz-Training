//Problem Statement: Flight Booking System (CRUD)Scenario:
//	 Simulate a basic flight booking system where users can search flights, book them,
//	 and view booking details. 
//	  Problem Requirements:
//	 ● Use Array to store available flight data.
//	 ● Store user bookings in a List.
//	 ● Use String operations to allow case-insensitive flight search.
//	 ● Use methods for searching, booking, and displaying bookings.
package flight;

import java.util.*;
public class FlightBookingSystem {
	Scanner input = new Scanner(System.in);
    private static List<Flight> flightList = new ArrayList<>();
    private static List<String> bookingDetails = new ArrayList<>();
    
	public void addFlight(Flight f) {
		flightList.add(f);
		System.out.println("Flight Added Successfully!!!");
	}
	
	public int searchFlight(String s, String d) {
		boolean found = false;
		int bookId = -1;
		for(Flight f : flightList) {
			if(f.getSource().toLowerCase().equals(s.toLowerCase()) && f.getDestination().toLowerCase().equals(d.toLowerCase())) {
				found = true;
				System.out.println("Flight Available from "+s+" to "+d+"\nFlight Id : "+f.getId()+"\nAirline : "+f.getAirLine()+"\nAvailable Seats : "+f.getSeat()+"\nPrice per Seat : "+f.getCost());
			}			
		}
		if(!found) {
			System.out.println("No Flight Available !!!");
			return -1;
		}
		System.out.println("Enter Id of Flight to book");
		bookId = input.nextInt();
		return bookId;
	}
	
	public void bookFlight(User u) {
		boolean stop = false;
		String s;
		String d;
		int passenger = 0;
		while(!stop) {
			System.out.println("1. Book Flight \n2. Exit");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.println("Enter Source");
				s = input.next().toLowerCase();
				System.out.println("Enter Destination");
				d = input.next().toLowerCase();
				FlightBookingSystem fbs = new FlightBookingSystem();
				int bookId = fbs.searchFlight(s, d);
				if(bookId == -1) return;
				for(Flight f : flightList) {
					if(f.getId() == bookId) {
						System.out.println("Enter Number of Passenger");
						passenger = input.nextInt();
						double bill = f.amount(passenger);
						f.updatePassenger();
						String message = "Passenger Name : "+u.getName()+"\nFrom "+s+" to "+d+"\nFlight Id : "+f.getId()+"\nAirline : "+f.getAirLine()+"\nNumber of Passenger : "+passenger+"\nTotal Bill : "+bill;
						bookingDetails.add(message);
						System.out.println("Flight Booked !!! \\n"+message);

					}
				}
				

			} else if(choice == 2) {
				stop = true;
			} else {
				System.out.println("Enter valid Input");
				break;
			}
		}
	}
}