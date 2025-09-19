// Hierarchical Inheritance Example 1: Bank Account Types

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("This is a Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("This is a Checking Account with Withdrawal Limit: " + withdrawalLimit + " transactions/month");
    }
}

class FixedDepositAccount extends BankAccount {
    int duration; // in months

    public FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account for " + duration + " months.");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 2000, 5);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 10000, 12);

        sa.displayAccountInfo();
        sa.displayAccountType();
        System.out.println("---------------------------------");

        ca.displayAccountInfo();
        ca.displayAccountType();
        System.out.println("---------------------------------");

        fda.displayAccountInfo();
        fda.displayAccountType();
    }
}
