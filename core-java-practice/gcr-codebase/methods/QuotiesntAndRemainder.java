// Problem Statement: Write a program to take 2 numbers and print their quotient and reminder
// Hint => 
// Take user input as integer
// Use division operator (/) for quotient and moduli operator (%) for reminder
// Write Method to find the reminder and the quotient of a number 
// public static int[] findRemainderAndQuotient(int number, int divisor) 

import java.util.Scanner;
public class QuotiesntAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(dividend, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        input.close();
    }
}
