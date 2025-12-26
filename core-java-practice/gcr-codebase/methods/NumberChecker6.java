//Problem Statement: Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
//Hint => 
//Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
//Method to find the number is an abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
//Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
//Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself

import java.util.Scanner;
public class NumberChecker6 {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Method to check Deficient Number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Method to check Strong Number
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Is Perfect Number: " + isPerfect(num));
        System.out.println("Is Abundant Number: " + isAbundant(num));
        System.out.println("Is Deficient Number: " + isDeficient(num));
        System.out.println("Is Strong Number: " + isStrong(num));

        input.close();
    }
}
