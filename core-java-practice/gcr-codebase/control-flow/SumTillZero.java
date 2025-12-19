// Problem Statement: Write a program to find the sum of numbers until the user enters 0

import java.util.Scanner;
public class SumTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double userEnteredValue;

        while (true) {
            userEnteredValue = input.nextDouble();
            if (userEnteredValue == 0) {
                break;
            }
            total += userEnteredValue;
        }

        System.out.println(total);
    }
}