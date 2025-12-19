// Problem Statement: Write a program to determine Leap Year with single if condition using logical and && and or || operators

import java.util.Scanner;
public class LeapYearOperator {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year is not in the Gregorian calendar.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year is a Leap Year.");
        } else {
            System.out.println("Year is not a Leap Year.");
        }
    }
}
