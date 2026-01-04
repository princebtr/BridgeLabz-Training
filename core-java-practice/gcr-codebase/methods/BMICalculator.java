//Problem Statement: An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
//Hint => 
//Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
//Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
//Create a Method to determine the BMI status usi

import java.util.Scanner;
public class BMICalculator {
//	Method of BMI Calculator
	public static double BMI(double weight, double height) {
		return weight / (height*height);
	}
	
//	Main method
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
//		Taking input
		double[][] arr = new double[10][3];
		for(int i=0; i<10; i++) {
			System.out.println("Enter Weight of Person "+ (i+1)+ " : ");
			arr[i][1] = input.nextDouble();
			System.out.println("Enter Height of Person "+ (i+1)+ " : ");
			arr[i][2] = input.nextDouble();
		}
		
//		Calling and printing Result
		for(int i=0; i<10; i++) {
			arr[i][2] = BMI(arr[i][0],arr[i][1]);
			System.out.println("BMI of Person "+(i+1)+" is : "+arr[i][2]);

			if (arr[i][2] < 18.5) {
	            System.out.println("Underweight");
	        } else if (arr[i][2] >= 18.5 && arr[i][2] < 24.9) {
	            System.out.println("Normal weight");
	        } else if (arr[i][2] >= 25 && arr[i][2] < 40) {
	            System.out.println("Overweight");
	        } else {
	            System.out.println("Obese");
	        }
		}
		input.close();
	}
}
