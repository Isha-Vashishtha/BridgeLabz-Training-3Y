package BankSystem;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}
