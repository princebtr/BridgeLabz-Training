//Problem Statement: Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
//Hint => 
//Take a, b, and c as input values to find the roots of x.
//The roots are computed using the following formulae
//delta = b2+ 4*a*c
//If delta is positive the find the two roots using formulae 
//root1 of x = (-b + delta)/(2*a) 
//root1 of x = (-b - delta)/(2*a)
//If delta is zero then there is only one root of x  
//root of x = -b/(2*a)
//If delta is negative return empty array or nothing 
//Write a Method to find find the roots of a quadratic equation and return the roots

import java.util.Scanner;	
public class QuadraticEquation {
//	Method to find delta
	public static int[] delta(int a, int b, int c) {
		int[] res = new int[3];
		
		res[2] = (b*b)+(4*a*c);
		
		if(res[2] > 0) {
			res[0] = (-b+res[2])/(2*a);
			res[1] = (-b-res[2])/(2*a);
		} else if(res[2] == 0) {
			res[0] = -b/(2*a);
		} 
		
		return res;
	}
	
//	Main method
	public static void main(String rgs[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers :");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int[] res = delta(a, b, c);
		
		if(res[2] < 0) {
			System.out.println("No roots exists");
		} else if(res[2] == 0) {
			System.out.println("Root of x is "+res[0]);
		}else {
			System.out.println("Roots of x are "+res[0]+" and "+res[1]);
		}
	}
}
