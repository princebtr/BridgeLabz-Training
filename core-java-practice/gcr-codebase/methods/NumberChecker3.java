//Problem Statement: Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
//Hint => 
//Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
//Method to find the sum of the digits of a number using the digits array
//Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
//Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
//Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NumberChecker3 {

    // Method to count digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method to store digits of number into array
    public static int[] numberToDigits(int num, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int num, int sumOfDigits) {
        return num % sumOfDigits == 0;
    }
    
//    Method to count frequency
    public static HashMap<Integer,Integer> countFrequency(int[] digits) {
    	HashMap<Integer,Integer> freq = new HashMap<>();
    	for(int i=0 ;i<digits.length; i++) {
    		freq.put(digits[i],freq.getOrDefault(digits[i], 0)+1);
    	}
    	return freq;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = countDigits(num);
        int[] digits = numberToDigits(num, count);
        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquaresOfDigits(digits);
        boolean harshad = isHarshadNumber(num, sumDigits);
        HashMap<Integer,Integer> freq = countFrequency(digits);

        System.out.println("Count of digits: " + count);

        System.out.print("Digits are: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("Sum of digits: " + sumDigits);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad Number: " + harshad);
        
        for(Map.Entry<Integer,Integer> x : freq.entrySet()) {
        	System.out.println("Frequency of "+x.getKey()+ " is : "+x.getValue());

        }

        input.close();
    }
}
