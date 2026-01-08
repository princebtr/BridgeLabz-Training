//Problem Statement: Online Banking System : Key Features (CRUD)
//Real Scenario
//Users perform transactions, check balance, and transfer money concurrently.Key Features
//Account creation
//Balance check
//Fund transfer
//Transaction history
//Concepts Used
//OOP: Account, SavingsAccount, CurrentAccount
//Inheritance: Account → SavingsAccount
//Abstraction: BankService interface
//Polymorphism: Different interest calculations
//Exception Handling: InsufficientBalanceException
//Multithreading: Concurrent transactions (synchronized)

package oops;

import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public interface Bank {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    void checkBalance();
    void transactionHistory();
    void transfer(Users toUser, double amount) throws InsufficientBalanceException;
}

class Account {
    static int accountCounter = 1000;
    String bankName = "State Bank of India";
    String name;
    double balance;
    String accType;
    int accNumber;

    Account(String name, double balance, String accType) {
        this.name = name;
        this.balance = balance;
        this.accType = accType;
        this.accNumber = ++accountCounter;
    }

    public void createAccount() {
        System.out.println("Account Created Successfully!");
        System.out.println("Name : " + name);
        System.out.println("Account Number : " + accNumber);
        System.out.println("Account Type : " + accType);
        System.out.println("Bank : " + bankName);
        System.out.println("-----------------------------");
    }
}

class Users extends Account implements Bank {

    int txnNumber = 0;
    List<String> accHistory = new ArrayList<>();

    Users(String name, double balance, String accType) {
        super(name, balance, accType);
    }

    @Override
    public synchronized void deposit(double amount) {
        balance += amount;
        txnNumber++;

        String log = "TXN " + txnNumber +
                " | Deposit: " + amount +
                " | Balance: " + balance;

        accHistory.add(log);
        System.out.println(log);
    }

    @Override
    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("❌ Insufficient Balance!");
        }

        balance -= amount;
        txnNumber++;

        String log = "TXN " + txnNumber +
                " | Withdraw: " + amount +
                " | Balance: " + balance;

        accHistory.add(log);
        System.out.println(log);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void transactionHistory() {
        System.out.println("---- Transaction History ----");
        for (String history : accHistory) {
            System.out.println(history);
        }
    }

    @Override
    public synchronized void transfer(Users toUser, double amount) throws InsufficientBalanceException {
        this.withdraw(amount);
        toUser.deposit(amount);

        String log = "TXN " + (++txnNumber) +
                " | Transfer to Acc " + toUser.accNumber +
                " | Amount: " + amount;

        accHistory.add(log);
        System.out.println(log);
    }
}

class BankApp {
    public static void main(String[] args) {

        Users user1 = new Users("Prince", 5000, "Savings");
        Users user2 = new Users("Rahul", 3000, "Current");

        user1.createAccount();
        user2.createAccount();

        Thread t1 = new Thread(() -> {
            user1.deposit(1000);
            try {
                user1.withdraw(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                user1.transfer(user2, 1500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        user1.transactionHistory();
        user2.transactionHistory();
    }
}

