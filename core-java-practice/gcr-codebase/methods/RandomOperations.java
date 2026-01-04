//Problem Statement: Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
//Hint => 
//Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
//public int[] generate4DigitRandomArray(int size)
//Write a method to find average, min and max value of an array 
//public double[] findAverageMinMax(int[] numbers) 

import java.util.Scanner;
public class RandomOperations {
//	Method to find Random numbers
	public static int[] generate4DigitRandomArray(int size) {
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = (int) (Math.random() * 10000);
		}
		return arr;
	}
	
//	Method to find Max min
	public static double[] findAverageMinMax(int[] numbers) {
		double[] res = new double[3];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
			if(numbers[i] > max) max = numbers[i];
			if(numbers[i] < min) min = numbers[i];
		}
		res[0] = sum/numbers.length;
		res[1] = max;
		res[2] = min;
		return res;
	}
	
//	Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size : ");
		int size = input.nextInt();
		
		int[] numbers = generate4DigitRandomArray(size);
		double[] res = findAverageMinMax(numbers);
		
		System.out.println("Avarage : "+res[0]);
		System.out.println("Maximum : "+res[1]);
		System.out.println("Minimum : "+res[2]);

	}

}