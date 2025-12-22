// Problem Statement: Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
// Hint => 
// Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
// Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

import java.util.Scanner;
public class VowelAndConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int[] counts = countVowelsAndConsonants(inputString);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        scanner.close();
    }
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }
    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
}
