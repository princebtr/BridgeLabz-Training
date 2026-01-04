//Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
//public static double convertYardsToFeet(double yards) => 
//Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
//Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
//Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
//Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
//Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;

import java.util.Scanner;
public class UnitConvertor2 {
//	Method to change Yard to Feet
	public static double convertYardsToFeet(double yards) {
		return 3*yards;
	}
//	Method to change Feet to Yard
	public static double convertFeetToYards(double feet) {
		return 0.333333*feet;
	}
//	Method to convert Meter to Inches
	public static double convertMeterToInches(double meter) {
		return 39.3701*meter;
	}
//	Method to convert Inches to Meter
	public static double convertInchesToMeter(double inches) {
		return 0.0254*inches;
	}
//	Method to convert Inches to CentiMeter
	public static double convertInchesToCM(double inches) {
		return 2.54*inches;
	}
//	Main method
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
//		Taking User Input
		System.out.println("Enter a number:");
		double num = input.nextDouble();
		
//		Calling methods for Conversion
		double yard2feet = convertYardsToFeet(num);
		double feet2yard = convertFeetToYards(num);
		double meter2inches = convertMeterToInches(num);
		double inches2meter = convertInchesToMeter(num);
		double inches2cm = convertInchesToCM(num);
		
//		Printing after Conversion
		System.out.println("Yards to Feet: " + yard2feet);
        System.out.println("Feet to Yards: " + feet2yard);
        System.out.println("Meters to Inches: " + meter2inches);
        System.out.println("Inches to Meters: " + inches2meter);
        System.out.println("Inches to Centimeters: " + inches2cm);
	}
}
