//Problem Statement: Banking System
//Description: Create a banking system with different account types:
//Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
//Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
//Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
//Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
//Use encapsulation to secure account details and restrict unauthorized access.
//Demonstrate polymorphism by processing different account types and calculating interest dynamically.

import java.util.*;

interface Loanable {
	void applyForLoan();
	void calculateLoanEligibility();
}

abstract class BankAccount{
	private int accountNumber;
	private String holderName;
	private double balance;
//	Constructor
	BankAccount(int accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
//	Setter Methods
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	Getter Methods
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
//	Concrete Methods
	void deposit(double amount) {
		balance += amount;
		System.out.println("Amount Deposited : "+amount);
	}
	void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Amount Withdrawn : "+amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable{
	double interest;
	SavingsAccount(int accountNumber, String holderName, double balance){
		super(accountNumber,holderName,balance);
	}
	@Override
	double calculateInterest() {
		interest = getBalance() * 0.04;
		return interest;
	}
	@Override
	public void applyForLoan() {
		System.out.println("Loan applied from Savings Account");
	}
	@Override
	public void calculateLoanEligibility() {
		System.out.println("Loan Eligibility : "+(getBalance() * 5));
	}
}

class CurrentAccount extends BankAccount implements Loanable{
	double interest;
	CurrentAccount(int accountNumber, String holderName, double balance){
		super(accountNumber,holderName,balance);
	}
	@Override
	double calculateInterest() {
		interest = getBalance() * 0.02;
		return interest;
	}
	@Override
	public void applyForLoan() {
		System.out.println("Loan applied from Current Account");
	}
	@Override
	public void calculateLoanEligibility() {
		System.out.println("Loan Eligibility : "+(getBalance() * 3));
	}
}

class Main{
	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		BankAccount a1 = new SavingsAccount(101,"Prince",50000);
		BankAccount a2 = new CurrentAccount(102,"Rahul",80000);
		
		accounts.add(a1);
		accounts.add(a2);
		
		for(BankAccount acc : accounts) {
			System.out.println("Account Holder : "+acc.getHolderName());
			acc.deposit(5000);
			acc.withdraw(3000);
			
			double interest = acc.calculateInterest();
			System.out.println("Calculated Interest : "+interest);
			
			if(acc instanceof Loanable) {
				Loanable loan = (Loanable) acc;
				loan.applyForLoan();
				loan.calculateLoanEligibility();
			}
		}
	}
}
