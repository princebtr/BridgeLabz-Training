// Problem Statement: Write a program to find the sum of n natural numbers using loop
// Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 

import java.util.Scanner;
public class SumOfNNumbers {
    // Method to find the sum of n natural numbers using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int result = sumOfNaturalNumbers(n);

        System.out.println("The sum of first " + n + " natural numbers is: " + result);

        input.close();
    }
}