// Problem Statement: Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.

import java.util.Scanner;
public class SumAndCompareForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        int sumUsingLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumUsingLoop += i;
        }

        int sumUsingFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumUsingLoop);
        System.out.println("Sum using formula: " + sumUsingFormula);

        if (sumUsingLoop == sumUsingFormula) {
            System.out.println("The results match. Both computations are correct.");
        } else {
            System.out.println("The results do not match. There is an error in the computations.");
        }
    }
}
