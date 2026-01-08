// Problem Statement: Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = new int[10];
        int[] frequency = new int[10];
        int count = 0;
        int tempNumber = Math.abs(number);
        
        if (tempNumber == 0) {
            count = 1;
            digits[0] = 0;
        } else {
            while (tempNumber > 0) {
                digits[count] = tempNumber % 10;
                count++;
                tempNumber /= 10;
            }
        }

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}