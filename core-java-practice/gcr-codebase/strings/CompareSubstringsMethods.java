//Problem Statement: Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint => 
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

import java.util.Scanner;
public class CompareSubstringsMethods {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
//		Taking user inputs
		System.out.println("Enter String");
		String str = input.nextLine();
		System.out.println("Enter start of Substring");
		int start = input.nextInt();
		System.out.println("Enter end of Substring");
		int end = input.nextInt();
		
//		Generating Substring
		String subStringByCharAt = genereteSubString(str,start,end);
		String subStringByMethod = str.substring(start, end);
		
//		Displaying Result
		System.out.println("String generated using charAt method: "+ subStringByCharAt);
		System.out.println("String generated using substring method: "+ subStringByMethod);
	}
	public static String genereteSubString(String str,int start,int end) {
		StringBuilder result = new StringBuilder();
		for(int i=start; i<end; i++) {
			result.append(str.charAt(i));
		}
		return result.toString();
	}
}
