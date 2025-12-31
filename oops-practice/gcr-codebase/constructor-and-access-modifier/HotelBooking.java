//Problem Statement: Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. 
//Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
//	Deafault Constructor
	HotelBooking(){
		guestName = "";
		roomType = "";
		nights = 0;
	}
	
//	Paramerterised Constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
//	Copy Constructor
	HotelBooking(HotelBooking h){
		this.guestName = h.guestName;
		this.roomType = h.roomType;
		this.nights = h.nights;
	}
	
	void display() {
		System.out.println("Guest Name : "+guestName+ "\nRoom Type : "+roomType+"\nNights : "+nights);
	}
	
	public static void main(String[] args) {
		HotelBooking h1 = new HotelBooking();
		HotelBooking h2 = new HotelBooking("Raju","Single",7);
		HotelBooking h3 = new HotelBooking(h2);
		h1.display();
		h2.display();
		h3.display();
	}

}
