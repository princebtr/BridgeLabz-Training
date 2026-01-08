// Problem Statement: Maya’s BMI Fitness Tracker 🏃‍♀️
// Maya, a fitness coach, wants to record the BMI of her clients.
// ● Ask for height and weight.
// ● Use formula BMI = weight / (height * height)
// ● Print category using if-else: Underweight, Normal, Overweight.
// Use clear variable names and comments to maintain code hygiene.

import java.util.Scanner;
public class HealthTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking User Input
        System.out.println("Enter Height (in meters): ");
        double height = input.nextDouble();
        System.out.println("Enter Weight (in kg): ");

        // Calculating BMI and Determining Category
        double weight = input.nextDouble();
        double bmi = weight / (height * height);
        if(bmi < 18.5){
            System.out.println("Underweight");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        } else {
            System.out.println("Overweight");
        }
    }
}