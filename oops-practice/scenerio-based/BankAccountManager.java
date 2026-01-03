//Problem Statement: Bank Account Manager
//1. Scenario: A banking app needs to perform operations like deposit, withdraw, and check balance for a user.
//● Problem: Design a BankAccount class with:
//● Fields/Properties: AccountNumber, Balance.
//● Methods: Deposit(double), Withdraw(double), CheckBalance().
//● Include logic to prevent overdraft.

import java.util.Scanner;
public class BankAccountManager {
	private int accountNumber;
	private double balance;
	
	BankAccountManager(int accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance += amount;
		System.out.println("Amount "+amount+" has been Successfully deposited to your account number "+accountNumber);
		System.out.println("Total amount is "+balance);
	}
	
	void withdraw(double amount) {
		balance -= amount;
		System.out.println("Amount "+amount+" has been Successfully deposited to your account number "+accountNumber);
		System.out.println("Total amount is "+balance);
	}
	
	void checkBalance() {
		System.out.println("Total amount is "+balance);
	}
	
	public static void main(String[] args) {
		BankAccountManager acc1 = new BankAccountManager(1433,45000);
		acc1.checkBalance();
		acc1.withdraw(7000);
		acc1.deposit(11000);
	}

}
