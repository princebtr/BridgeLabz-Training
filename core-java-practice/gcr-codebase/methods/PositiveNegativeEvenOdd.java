//Problem Statement: Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
//Hint => 
//Write a Method to Check whether the number is positive or negative
//Write a Method to check whether the number is even or odd
//Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
//In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
//If the number is negative, print negative. 
//Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less

import java.util.Scanner;
public class PositiveNegativeEvenOdd {
//	Method to find Positive or negative number
	public static boolean isPositive(int num) {
		if(num < 0) return false;
		return true;
	}
	
//	Method to find even or odd
	public static boolean isEven(int num) {
		if(num % 2 != 0) return false;
		return true;
	}
	
//	Comparing First and Last element
	public static int compare(int a,int b) {
		if(a == b) {
			return 0;
		} else if( a > b) {
			return 1;
		}
		return -1;
	}
	
//	Main method
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
//		Taking user input
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter number: ");
			num[i] = input.nextInt();
		}
		
//		Printing output
		for(int i=0; i<5; i++) {
			boolean pos = isPositive(num[i]);
			System.out.println(num[i] + " is Positive : "+ pos);
			if(pos) {
				System.out.println(num[i]+" is Even : "+ isEven(num[i]));
			}
		}
		int comp = compare(num[0],num[4]);
		if(comp == 0) {
			System.out.println(num[0]+" is Equal to "+num[4]);
		} else if(comp == 1) {
			System.out.println(num[0]+" is Greater than "+num[4]);
		} else {
			System.out.println(num[0]+" is Less than "+num[4]);
		}
	}
}
