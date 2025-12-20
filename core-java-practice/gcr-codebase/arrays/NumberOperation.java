// Problem Statement: Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;
public class NumberOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking each number for positive, negative, zero and even/odd
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is a positive even number.");
                } else {
                    System.out.println(number + " is a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing the first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal: " + numbers[0]);
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element " + numbers[0] + " is greater than the last element " + numbers[numbers.length - 1]);
        } else {
            System.out.println("The first element " + numbers[0] + " is less than the last element " + numbers[numbers.length - 1]);
        }
    }
}
