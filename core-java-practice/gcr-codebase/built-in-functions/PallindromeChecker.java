//Problem Statement: Palindrome Checker:
//	○ Write a program that checks if a given string is a palindrome (a word, phrase, or
//			sequence that reads the same backward as forward).
//			○ Break the program into functions for input, checking the palindrome condition,
//			and displaying the result.

import java.util.Scanner;
public class PallindromeChecker {
	
//	Check pallindrome
	public static boolean isPallendrome(String s) {
		StringBuilder str = new StringBuilder(s);
		if(s.equals(str.reverse().toString())) return true;
		return false;
	}
	
//	main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text");
		String s = input.nextLine();
		System.out.println("Is "+s+" Pallindrome : "+ isPallendrome(s));


	}

}
