package BankSystem;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 500);
        bank.openAccount(c2, 1000);

        bank.showCustomers();

        c1.viewBalance();
        c2.viewBalance();
    }
}
