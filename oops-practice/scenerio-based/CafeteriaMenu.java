//Problem Statement: Cafeteria Menu App
//Focus: Arrays, Methods
//● Scenario: The campus cafeteria offers 10 fixed items daily. You need to build a system to display menu items and take orders based on user input.
//● Requirements:
//● Store items in a string[] array.
//● Print the menu with index numbers.
//● Allow the user to select an item by index.
//● Use methods like DisplayMenu(), GetItemByIndex().

import java.util.Scanner;
public class CafeteriaMenu {
	static String[] menu = {"Pizza","Burger","Pasta","Sandwich","French Fries","Biryani","Noodles","Paneer Butter Masala","Dosa","Ice Cream"};
	static void displayMenu() {
		System.out.println("Idx  Item");
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+". "+menu[i]);
		}
		System.out.println("Select item from menu by index number");
	}
	static void getItemByIndex(int i) {
		System.out.println("Order Successful !!!");
		System.err.println(menu[i-1]+" QTY - 1");
		System.out.println("Thankyou !!! Visit Again");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		displayMenu();
		int i = input.nextInt();
		getItemByIndex(i);
	}

}
