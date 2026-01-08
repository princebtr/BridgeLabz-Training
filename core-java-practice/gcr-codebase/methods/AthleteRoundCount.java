// Problem Statement: An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
// Hint => 
// Take user input for 3 sides of a triangle 
// The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
// Write a Method to compute the number of rounds user needs to do to complete 5km run

import java.util.Scanner;
public class AthleteRoundCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        // Calculate perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000.0;

        // Calculate number of rounds needed to complete 5 km
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run.");

        input.close();
    }
}
