// Problem Statement: Write a program to convert the complete text to lowercase and compare the results
// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result

import java.util.Scanner;
public class ToLowerAndComapre {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String lowerCaseText = text.toLowerCase();
        boolean areEqual = compareStrings(convertToLowerCase(text), lowerCaseText);
        System.out.println("Are the two lowercase strings equal? " + areEqual);

    }
    public static String convertToLowerCase(String str) {
        StringBuilder upperStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is lowercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                ch = (char) (ch + 32);
            }
            upperStr.append(ch);
        }
        return upperStr.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        // Length is different
        if (s1.length() != s2.length()) {
            return false;
        }
        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
