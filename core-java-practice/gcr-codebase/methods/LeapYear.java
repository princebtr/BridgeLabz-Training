// Problem Statement: Write a program that takes a year as input and outputs the Year is a Leap Year or not 
// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
// Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
// Write a method to check for Leap Year using the conditions a and b

import java.util.Scanner;
public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Year " + year + " is a Leap Year.");
        } else {
            System.out.println("Year " + year + " is not a Leap Year.");
        }

        input.close();
    }
}