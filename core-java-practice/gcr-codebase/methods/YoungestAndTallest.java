//Problem Statement: Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
//Hint => 
//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
//Write a Method to find the youngest of the 3 friends
//Write a Method to find the tallest of the 3 friends

import java.util.Scanner;
public class YoungestAndTallest {
//	Method to find Youngest among 3 friends
	public static int youngestFriend(int[] age) {
		int youngest = Math.min(age[0], Math.min(age[1],age[2]));
		return youngest;
	}
//	Method to find Tallest 
	public static int tallestFriend(int[] height) {
		int tallest = Math.max(height[0],Math.max(height[1],height[1]));
		return tallest;
	}
//	Main method to take input and return output
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
//		Taking input from user and declearing variable
		int[] age = new int[3];
		int[] height = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter Age of "+ (i+1) + " friend :");
			age[i] = input.nextInt();
			
			System.out.println("Enter Height of "+ (i+1) + " friend :");
			height[i] = input.nextInt();
		}
		
		int youngest = youngestFriend(age);
		int tallest = tallestFriend(height);
		
//		Printing Youngest Friend
		if(age[0] == youngest) {
			System.out.println("Amar is Youngest");
		} else if(age[1] == youngest) {
			System.out.println("Akabar is Youngest");
		}else {
			System.out.println("Antony is Youngest");
		}
		
//		Printing Tallest Friend
		if(height[0] == tallest) {
			System.out.println("Amar is Tallest");
		} else if(height[1] == tallest) {
			System.out.println("Akabar is Tallest");
		}else {
			System.out.println("Antony is Tallest");
		}
		
		input.close();
	}
}
