// Problem Statement: Metro Smart Card Fare Deduction 🚇
// In Delhi Metro, fare varies by distance.
// Ask the user for distance.
// Calculate fare using ternary operator.
// Deduct from smart card balance.
// Loop until balance is exhausted or the user quits.

import java.util.Scanner;
public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 500.0; // Taking Initial balance 500
        String continueTravel;

        do {
            System.out.print("Enter travel distance in km: ");
            double distance = input.nextDouble();
            double fare = (distance <= 5) ? 10.0 : (distance <= 15) ? 20.0 : 30.0;

            if (fare > balance) {
                System.out.println("Insufficient balance for this trip. Current balance: " + balance);
                break;
            }

            balance -= fare;
            System.out.println("Fare deducted: " + fare + ". Remaining balance: " + balance);

            if (balance <= 0) {
                System.out.println("Balance exhausted. Please recharge your smart card.");
                break;
            }

            System.out.print("Do you want to continue traveling? (yes/no): ");
            continueTravel = input.next();
        } while (continueTravel.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Delhi Metro. Final balance: " + balance);
        input.close();
    }
}
