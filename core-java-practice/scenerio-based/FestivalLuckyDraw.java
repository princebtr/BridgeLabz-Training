//Problem Statement: * Festival Lucky Draw 🎉
//At Diwali mela, each visitor draws a number.
//● If the number is divisible by 3 and 5, they win a gift.
//● Use if, modulus, and loop for multiple visitors.
//● continue if input is invalid.

import java.util.Scanner;
public class FestivalLuckyDraw {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x  = 1;
		while(x == 1) {
			System.out.println("Enter Lucky Draw number");
			int ld = input.nextInt();
			if(ld % 3 == 0 && ld % 5 == 0) {
				System.out.println("Congratulation... You Win !!!");
			} else {
				System.out.println("Better Luck next Time !!!");
			}
			System.out.println("Enter 1 to continue or anything to exit");
			x = input.nextInt();
		}
	}

}
