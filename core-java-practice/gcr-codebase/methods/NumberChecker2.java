//Problem Statement: Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
//Hint => 
//Method to Find the count of digits in the number
//Method to Store the digits of the number in a digits array
//Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
//Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
//Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
//Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.

import java.util.Scanner;
public class NumberChecker2 {
	
	public int countNum(int num) {
		int i = 0;
		while(num != 0) {
			num /= 10;
			i++;
		}
		return i;
	}
	
	public int[] numberToDigits(int num,int count) {
		int[] digits = new int[count];
		count--;
		while(num != 0) {
			digits[count--] = num%10;
			num /= 10;
		}
		return digits;
	}
	
	public boolean duckNuumber(int[] digits) {
		for(int i=0; i<digits.length; i++) {
			if(digits[i] == 0) return false;
		}
		return true;
	}
	
	public boolean armstrongNumber(int[] digits, int num) {
		int x = 0;
		for(int i : digits) {
			x += Math.pow(i, digits.length);
		}
		return num == x;
	}
	
	public int[] lar2Lar(int[] digits) {
		int[] res = new int[2];
		int lar = Integer.MIN_VALUE;
		int lar2 = Integer.MIN_VALUE;
		for(int i : digits) {
			if(i > lar) {
				lar2 = lar;
				lar = i;
			} else if(i > lar2 && i != lar) {
				lar2 = i;
			}
		}
		res[0] = lar;
		res[1] = lar2;
		return res;
	}
	
	public int[] sm2sm(int[] digits) {
		int[] res = new int[2];
		int sm = Integer.MAX_VALUE;
		int sm2 = Integer.MAX_VALUE;
		for(int i : digits) {
			if(i < sm) {
				sm2 = sm;
				sm = i;
			} else if(i < sm2 && sm != i) {
				sm2 = i;
			}
		}
		res[0] = sm;
		res[1] = sm2;
		return res;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberChecker2 nc = new NumberChecker2();
		
		System.out.println("Enter a Number : ");
		int num = input.nextInt();
		
		int count = nc.countNum(num);
		int[] digits = nc.numberToDigits(num, count);
		boolean duck = nc.duckNuumber(digits);
		boolean armstrong = nc.armstrongNumber(digits, num);
		int[] lar = nc.lar2Lar(digits);
		int[] sm = nc.sm2sm(digits);
		
		System.out.println("Count of digits : "+count);
		System.out.print("Digits are : ");
		for(int i=0; i<count; i++) {
			System.out.print(digits[i]+" ");
		}
		System.out.println();
		System.out.println("Is this Duck Number : "+duck);
		System.out.println("Is this Armstrong Number : "+armstrong);
		System.out.println("Largest Digit : "+lar[0]);
		System.out.println("Second Largest Digit : "+lar[1]);
		System.out.println("Smallest digit : "+sm[0]);
		System.out.println("Second Smallest Digit : "+sm[1]);
		
		input.close();
	}

}
