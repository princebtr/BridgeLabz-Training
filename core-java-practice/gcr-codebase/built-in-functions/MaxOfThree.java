//Problem Statement: Maximum of Three Numbers:
//	○ Write a program that takes three integer inputs from the user and finds the
//	maximum of the three numbers.
//	○ Ensure your program follows best practices for organizing code into modular
//	functions, such as separate functions for taking input and calculating the
//	maximum value.
	
import java.util.Scanner;
public class MaxOfThree {
	
//	Method to find Maximum
	public static int maxNumber(int x,int y,int z) {
		return Math.max(x, Math.max(y, z));
	}
	
//	MAin Method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three number");

		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int max = maxNumber(x,y,z);
		System.out.println("Maximum Number : "+ max);

	}

}
