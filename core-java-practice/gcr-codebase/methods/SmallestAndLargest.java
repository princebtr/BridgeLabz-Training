// Problem Statement: Write a program to find the smallest and the largest of the 3 numbers.
// Hint => 
// Take user input for 3 numbers
// Write a single method to find the smallest and largest of the three numbers
// public static int[] findSmallestAndLargest(int number1, int number2, int number3)

import java.util.Scanner;
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        result[0] = Math.min(Math.min(number1, number2), number3);
        result[1] = Math.max(Math.max(number1, number2), number3);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        input.close();
    }
}
