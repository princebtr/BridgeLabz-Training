//Problem Statement: Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
//Hint => 
//Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
//Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
//Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
//Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
//Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7

import java.util.Scanner;

public class NumberChecker5 {

    // Method to check Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to check Neon Number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check Spy Number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp != 0) {
            if (square % 10 != temp % 10)
                return false;

            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // Method to check Buzz Number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Is Prime Number: " + isPrime(num));
        System.out.println("Is Neon Number: " + isNeon(num));
        System.out.println("Is Spy Number: " + isSpy(num));
        System.out.println("Is Automorphic Number: " + isAutomorphic(num));
        System.out.println("Is Buzz Number: " + isBuzz(num));

        input.close();
    }
}
