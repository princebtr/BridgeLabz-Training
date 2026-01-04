// Problem Statement: Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
// Hint => 
// Take the input for a number
// Write a static Method to find the factors of the number and save them in an array and return the array. 
// To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
// Write a method to find the sum of the factors using factors array
// Write a method to find the product of the factors using factors array
// Write a method to find the sum of square of the factors using Math.pow() method

import java.util.Scanner;
public class OperationsOnFactors {
    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array to hold the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }
    // Method to calculate the sum of factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method to calculate the product of factors
    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // Method to calculate the sum of squares of factors
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Finding factors and storing them in an array
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculating sum, product, and sum of squares of the factors
        int sum = calculateSum(factors);
        int product = calculateProduct(factors);
        int sumOfSquares = calculateSumOfSquares(factors);

        // Displaying the results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        input.close();
    }
}
