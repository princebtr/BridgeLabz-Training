// Problem Statement: Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// Finally display the youngest and tallest of the 3 friends

import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Finding the tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying results
        System.out.println("The youngest friend is: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        scanner.close();
    }
}
