//Problem Statement: Prime Number Checker:
//	○ Create a program that checks whether a given number is a prime number. ○
//	The program should use a separate function to perform the prime check and
//	return the result.
			
import java.util.Scanner;
public class PrimeNumberChecker {
//	method to check prime
	public static boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
//	main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		System.out.println("Is "+num+" Prime : "+isPrime(num));

	}

}
