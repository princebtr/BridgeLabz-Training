// Problem Statement: Create a program to find the power of a number.

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;

        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive integer for both number and power.");
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println("Result: " + result);
        }
    }
}