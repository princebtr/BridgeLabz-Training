// Problem Statement: Create a program to find the maximum number of handshakes among students.
// Hint => 
// Get integer input for the numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Write a method to use the combination formulae to calculate the number of handshakes
// Display the number of possible handshakes.

import java.util.Scanner;
public class MaximumHandshakes {
    // Method to calculate maximum handshakes
    public static int calculateMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calling method to calculate maximum handshakes
        int maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);

        input.close();
    }
}
