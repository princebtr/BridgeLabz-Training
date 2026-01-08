// Problem Statement: Rewrite the above program to find the power of a number using a while loop.

import java.util.Scanner;
public class PowerUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;

        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive integer for both number and power.");
        } else {
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result: " + result);
        }
    }
}
