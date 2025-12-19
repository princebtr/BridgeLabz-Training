// Problem Statement: Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct.

import java.util.Scanner;
public class SumAndCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        int sumUsingLoop = 0;
        int count = 1;
        while (count <= n) {
            sumUsingLoop += count;
            count++;
        }

        int sumUsingFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumUsingLoop);
        System.out.println("Sum using formula: " + sumUsingFormula);

        if (sumUsingLoop == sumUsingFormula) {
            System.out.println("The results match. Both computations are correct.");
        } else {
            System.out.println("The results do not match. There is an error in the computations.");
        }
    }
}
