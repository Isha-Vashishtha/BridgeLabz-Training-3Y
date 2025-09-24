package BankSystem;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        customer.deposit(initialDeposit);
        customers.add(customer);
        System.out.println(customer + " account opened in " + bankName);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName + " Customers:");
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}
