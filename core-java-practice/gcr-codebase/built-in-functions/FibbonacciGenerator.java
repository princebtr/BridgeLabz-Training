//Problem Statement: Fibonacci Sequence Generator:
//	○ Write a program that generates the Fibonacci sequence up to a specified number
//	of terms entered by the user.
//	○ Organize the code by creating a function that calculates and prints the Fibonacci
//	sequence.

import java.util.Scanner;
public class FibbonacciGenerator {
	
//	method to generate fibbonacci sequence
	public static void fibbonacciGenerator(int n) {
//		int[] res = new int[n];
		int a = 0;
		int b = 1;
		for(int i=0; i<n; i++) {
			System.out.print(a+" ");
			int c = a;
			a = b;
			b = b+c;
		}
	}
	
//	main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();
		System.out.print("Fibonacci series is : ");
		fibbonacciGenerator(n);

	}

}
