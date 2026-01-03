// Superclass
class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Subclasses
class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    CheckingAccount(String accNo, double balance, int withdrawalLimit) {
        super(accNo, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;

    FixedDepositAccount(String accNo, double balance, int tenure) {
        super(accNo, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Tenure: " + tenure + " years");
    }
}
