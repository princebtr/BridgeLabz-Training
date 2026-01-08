//Problem Statement: Number Guessing Game:
//	Write a Java program where the user thinks of a number between 1 and 100, and
//	the computer tries to guess the number by generating random guesses.
//	The user provides feedback by indicating whether the guess is high, low, or
//	correct. The program should be modular, with different functions for generating
//	guesses, receiving user feedback, and determining the next guess.

import java.util.Scanner;
public class NumberGuessingGame {
	
//	Mrthod to guess number
	public static int guessNumber(int start,int end) {
		int ranNum = start + (int)(Math.random()*(end - start +1));
		return ranNum;
	}
	
//	Asking user for feedback
//	Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start = 1;
		int end = 100;
		boolean found = false;
		int ranNum = 0;
		
		System.out.println("Think of a Number between 1 to 100");
		
		while(!found) {
			ranNum = guessNumber(start,end);
			
			System.out.println("Is "+ranNum+" is your Number reply yes or no");
			String reply = input.nextLine();
			
			if(reply.equals("yes")) {
				found = true;
			} else if(reply.equals("no")) {
				System.out.println("Is your number greater or less than " +ranNum + "?");
				
				String x = input.nextLine();
				if(x.equals("less")) {
					start = ranNum + 1;
				} else if(x.equals("greater")) {
					end = ranNum - 1;
				} else {
					System.out.println("Wrong Input");
				}
				
			} else {
				System.out.println("Wrong Input");
			}
		}
		System.out.println("Yayy guessed number is : "+ranNum);
	}

}
