//Problem Statement: * Sandeep’s Fitness Challenge Tracker ️‍♂️
//Each day Sandeep completes a number of push-ups.
//● Store counts for a week.
//● Use for-each to calculate total and average.
//● Use continue to skip rest days.

import java.util.Scanner;
public class FitnessTracker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pushUp = 0;
		for(int i=0; i<7; i++) {
			System.out.println("Enter no of Push Up you did on Day "+(i+1)+" (if it's a rest day type rest) : ");
			String str = input.nextLine();
			if(str.equals("rest")) {
				continue;
			} else {
				pushUp += Integer.parseInt(str);
			}
		}
		System.out.println("Yayy !!! you did "+pushUp+" this week");
		System.out.println("Avarage is "+(pushUp/7)+" per day");
	}

}
