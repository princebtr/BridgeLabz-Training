// Problem Statement: Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
// Hint => 
// Take user input using the  Scanner next() method for 2 String variables
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String Built-In method to check if the results are the same and display the result

import java.util.Scanner;
public class CompareMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        // Comparing strings using charAt() method
        boolean charAtComparison = compareUsingCharAt(str1, str2);
        // Comparing strings using built-in equals() method
        boolean equalsComparison = str1.equals(str2);
        // Displaying the results

        boolean resultMatch = (charAtComparison == equalsComparison);
        System.out.println("Result after comparing, is both statements equal: " + equalsComparison);
        System.out.println("Result after comparing using charAt() and equals() methods: " + resultMatch);
    }
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}