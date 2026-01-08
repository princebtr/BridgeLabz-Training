//Problem Statement: Bus Route Distance Tracker 🚌
//Each stop adds distance.
//Ask if the passenger wants to get off at a stop.
//Use a while-loop with a total distance tracker.
//Exit on user confirmation.

import java.util.Scanner;
public class BusRouteDistanceTracker {
	
//	Method to calculate total distance
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d = 0;
		int sum = 0;
		while(d != -1) {
			System.out.println("Enter distance to travel or -1 if you want to get off");
			sum += d;
			d = input.nextInt();
		}
		System.out.println("Total Distance : "+sum);
	}

	
}
