//Problem Statement: Write a program for Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()

import java.util.Scanner;
public class DistanceAndLine {

    // Method to find Euclidean distance between two points
    public static double euclideanDistance(
            double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }

    // Method to find slope (m) and y-intercept (b)
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {

        double[] result = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        result[0] = m;
        result[1] = b;

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] line = lineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Y-intercept (b) = " + line[1]);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);

        input.close();
    }
}
