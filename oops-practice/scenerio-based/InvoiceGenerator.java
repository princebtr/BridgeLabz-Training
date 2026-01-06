//Problem Statement: Invoice Generator for Freelancers
//Focus: Strings, Methods
//● Scenario: You're building an app for freelancers to generate invoice descriptions.
// Requirements:
//● Accept input like: "Logo Design - 3000 INR, Web Page - 4500 INR".
//● Split the string to extract task names and amounts.
//● Calculate total invoice amount.
//● Example Methods:
//● ParseInvoice(string input)
//● GetTotalAmount(string[] tasks)

import java.util.Scanner;
public class InvoiceGenerator {
	
	static double totalBill;
	
	static void parseInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter bills seperated by comma");
		String bill = input.nextLine();
		String[] bills = bill.split(",");
		totalBill = 0;
		System.out.println("Work  Charges");
		for(String s : bills) {
			s = s.trim();
			String[] work = s.split("-");
			System.out.println(s);
			totalBill += Integer.parseInt(work[1].trim());
		}
	}
	
	static void getTotalAmount() {
		System.out.println("Total Amount : "+totalBill);
	}
	
	public static void main(String[] args) {
		parseInput();
		getTotalAmount();
	}

}
