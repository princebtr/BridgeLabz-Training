// Problem Statement: Create a program to find the bonus of employees based on their years of service.

import java.util.Scanner;
public class BonusForEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus is given.");
        }
    }
}