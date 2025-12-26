//Problem Statement: Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
//Hint => 
//Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
//Method to reverse the digits array 
//Method to compare two arrays and check if they are equal
//Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
//Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it

import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker4 {

    // Method to count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] numberToDigits(int num, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            rev[j++] = digits[i];
        }
        return rev;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    // Method to check palindrome number using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check Duck Number (as per given hint)
    // Duck number: number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0)
                return true;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = countDigits(num);
        int[] digits = numberToDigits(num, count);
        int[] reversed = reverseDigits(digits);

        boolean palindrome = isPalindrome(digits);
        boolean duck = isDuckNumber(digits);

        System.out.println("Count of digits: " + count);

        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.print("\nReversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }

        System.out.println("\nArrays Equal: " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome Number: " + palindrome);
        System.out.println("Is Duck Number: " + duck);

        input.close();
    }
}
