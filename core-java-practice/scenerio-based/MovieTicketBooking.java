//Problem Statement: Movie Ticket Booking App 🎬
//Ask users for movie type, seat type (gold/silver), and snacks.
//● Use switch and if together.
//● Loop through multiple customers.
//● Clean structure and helpful variable names.

import java.util.Scanner;
public class MovieTicketBooking {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean stop = false;
		String movie = "";
		int price = 0;
		int seatPrice = 0;
		int snacksPrice = 0;
		int total = 0;
		
		while(!stop) {
			System.out.println("Want to book Movie ticket (yes/no)");
			String book = input.nextLine().toLowerCase();
			if(book.equals("no")) {
				stop = true;
			} 
			
			System.out.println("Select Movie type : \n1. COMEDY \n2. HORROR \n3. ACTION ");
			int movieType = input.nextInt();
			switch(movieType) {
			case(1):movie = "Comedy";
					price = 200;
					total += price;
			case(2):movie = "Horror";
					price = 300;
					total += price;
			case(3):movie = "Action";
					price = 400;
					total += price;
			}
			
			System.out.println("Select seat type : (GOLD/SILVER");
			String seat = input.nextLine().toLowerCase();
			if(seat.equals("gold")) {
				seatPrice = 500;
				total += seatPrice;
			} else {
				seatPrice = 300;
				total += seatPrice;
			}
			
			System.out.println("Do you want Sanacks ?? (yes/no)");
			String snacks = input.nextLine().toLowerCase();
			if(snacks.equals("yes")) {
				snacksPrice = 500;
				total += snacksPrice;
			}
			System.out.println("YOUR TICKETS HAS BEEN BOOKED !!!");
			System.out.println("Movie Type : "+movie+"\nMovie Price : "+price+"\nSeat Type : "+seat+" \nSeat Price : "+seatPrice+"\nSnacks : "+snacks+"\nSnacks Price : "+snacksPrice+"\nTotal : "+total);
		}
		
	}

}
