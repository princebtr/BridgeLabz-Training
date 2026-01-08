// Problem Statement: Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
// Hint => 
// Get an integer value from user for the numberOfchocolates and numberOfChildren.
// Write the method to find the number of chocolates each child gets and number of remaining chocolates
// public static int[] findRemainderAndQuotient(int number, int divisor) 

import java.util.Scanner;
public class DividingChocolates {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // chocolates per child
        result[1] = number % divisor; // remaining chocolates
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        input.close();
    }
}
