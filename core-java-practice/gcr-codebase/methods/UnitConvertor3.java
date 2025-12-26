//Problem Statement: Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
//public static double convertFarhenheitToCelsius(double farhenheit) => 
//Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
//Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
//Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
//Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
//Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
//Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 

import java.util.Scanner;

public class UnitConvertor3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method (SAME STYLE AS YOU)
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Taking User Input
        System.out.print("Enter a number:");
        double num = input.nextDouble();

        // Calling conversion methods
        double f2c = convertFarhenheitToCelsius(num);
        double c2f = convertCelsiusToFarhenheit(num);
        double p2kg = convertPoundsToKilograms(num);
        double kg2p = convertKilogramsToPounds(num);
        double g2l = convertGallonsToLiters(num);
        double l2g = convertLitersToGallons(num);

        // Printing after Conversion (same as you)
        System.out.println("Farhenheit to Celsius: " + f2c);
        System.out.println("Celsius to Farhenheit: " + c2f);
        System.out.println("Pounds to Kilograms: " + p2kg);
        System.out.println("Kilograms to Pounds: " + kg2p);
        System.out.println("Gallons to Liters: " + g2l);
        System.out.println("Liters to Gallons: " + l2g);

        input.close();
    }
}
