// Problem Statement: The Coffee Counter Chronicles ☕
// Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
// that:
// ● Asks for coffee type (switch)
// ● Calculates total bill (price * quantity)
// ● Adds GST using arithmetic operators
// Use while to continue for the next customer and break when "exit" is typed.

import java.util.Scanner;
public class TheCoffeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBill = 0;
        while(true){
		System.out.println("Enter Coffee Type : 1: Laate 2: Cappuccino 3: Espresso or type exit to EXIT");
		String coffeeType = input.next();
		if(coffeeType.equals("exit")){
			break;
		}
        System.out.println("Enter Quantity : ");
        int quantity = input.nextInt();
        switch(coffeeType){
            case "1":
                totalBill = 100 * quantity;
                break;
            case "2":
                totalBill = 150 * quantity;
                break;
            case "3":
                totalBill = 200 * quantity;
                break;
            default:
                System.out.println("Invalid Coffee Type");
                continue;
        }
        double gst = totalBill * 0.18;
        double finalBill = totalBill + gst;
        System.out.println("Total Bill (including GST): " + finalBill);
    }

    }
}
