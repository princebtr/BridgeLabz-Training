// Problem Statement: Create a program to find the BMI of a person

import java.util.Scanner;
public class BMIOfPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 40) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}