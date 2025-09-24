package ECommerceSystem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed an order.");
    }

    public void showOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}
