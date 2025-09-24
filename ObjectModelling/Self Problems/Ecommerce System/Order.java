package ECommerceSystem;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            p.showProduct();
            total += p.getPrice();
        }
        System.out.println("Total: $" + total + "\n");
    }
}
