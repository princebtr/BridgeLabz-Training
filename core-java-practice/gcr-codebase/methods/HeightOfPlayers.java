//Problem Statement: Create a program to find the shortest, tallest, and mean height of players present in a football team.
//Hint => 
//The formula to calculate the mean is: mean = sum of all elements/number of elements
//Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
//Write the method to Find the sum of all the elements present in the array.
//Write the method to find the mean height of the players on the football team
//Write the method to find the shortest height of the players on the football team 
//Write the method to find the tallest height of the players on the football team
//Finally display the results

import java.util.Arrays;
import java.util.Scanner;
public class HeightOfPlayers {
	
	public int sumOfElements(int[] height) {
		int sum=0;
		for(int i=0; i<height.length; i++){
			sum += height[i];
		}
		return sum;
	}
	
	public int meanOfHeight(int[] height, int sum) {
		return sum/height.length;
	}
	
	public int shortest(int[] height) {
//		Arrays.sort(height);
		return height[0];
	}
	
	public int tallest(int[] height) {
//		Arrays.sort(height);
		return height[height.length-1];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HeightOfPlayers hop = new HeightOfPlayers();
		
		int[] height = new int[11];
		
		for(int i=0; i<11; i++) {
			height[i] = 150 + (int) (Math.random() * (250-150+1));
//			System.out.println(height[i]);
		}
		
		int sum = hop.sumOfElements(height);
		int mean = hop.meanOfHeight(height, sum);
		Arrays.sort(height);
		int shor = hop.shortest(height);
		int tall = hop.tallest(height);
		
		System.out.println("Sum of Heights : "+sum);
		System.out.println("Mean of Heights : "+mean);
		System.out.println("Tallest Player's Height : "+tall);
		System.out.println("Shortest Player's Height : "+shor);




	}

}
