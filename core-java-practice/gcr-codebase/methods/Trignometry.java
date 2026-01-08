// Problem Statement: Write a program to calculate various trigonometric functions using Math class given an angle in degrees
// Hint => 
// Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)

import java.util.Scanner;
public class Trignometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + trigFunctions[0]);
        System.out.println("Cosine: " + trigFunctions[1]);
        System.out.println("Tangent: " + trigFunctions[2]);

        input.close();
    }
}
