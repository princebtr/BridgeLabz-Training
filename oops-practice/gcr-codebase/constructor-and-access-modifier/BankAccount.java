// Problem Statement: Bank Account Management
// Create a BankAccount class with:
// accountNumber (public).
// accountHolder (protected).
// balance (private).
// Write methods to:
// Access and modify balance using public methods.
// Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    void display() {
        System.out.println(accountNumber + " | " + accountHolder);
    }
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(123456, "Alice Smith", 1000.0);
        savings.display();
        System.out.println("Balance: " + savings.getBalance());
        savings.setBalance(1500.0);
        System.out.println("Updated Balance: " + savings.getBalance());
    }
}
