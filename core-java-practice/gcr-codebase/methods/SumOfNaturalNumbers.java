// Problem Statement: Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// Write a Method to find the sum of n natural numbers using recursion
// Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
// Compare the two results and print the result

import java.util.Scanner;
public class SumOfNaturalNumbers {
    // Method to calculate sum of n natural numbers using recursion
    public static int sumOfNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbersRecursive(n - 1);
    }
    // Method to calculate sum of n natural numbers using the formula
    public static int sumOfNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for a natural number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
        } else {
            // Calculate sum using recursion
            int sumRecursive = sumOfNaturalNumbersRecursive(n);

            // Calculate sum using formula
            int sumFormula = sumOfNaturalNumbersFormula(n);

            // Output the results
            System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRecursive);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);

            // Compare the two results
            if (sumRecursive == sumFormula) {
                System.out.println("Both methods give the same result. The computation is correct.");
            } else {
                System.out.println("The results do not match. There is an error in computation.");
            }
        }

        input.close();
    }
}
