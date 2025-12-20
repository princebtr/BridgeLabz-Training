// Problem Statement: Create a program to find the mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements / number of elements
// Create a double array named heights of size 11 and get input values from the user.
// Find the sum of all the elements present in the array.
// Divide the sum by 11 to find the mean height and print the mean height of the football team

import java.util.Scanner;
public class HeightOfPlayers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double meanHeight = sum / heights.length;
        System.out.printf("The mean height of the football team is: %.2f\n", meanHeight);
    }
}
