// Multilevel Inheritance Example 1: Online Retail Order Management

class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus() {
        System.out.println("Order placed with ID: " + orderId + " on " + orderDate);
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order " + orderId + " has been shipped. Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order " + orderId + " has been delivered on " + deliveryDate);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("O101", "2025-09-19");
        ShippedOrder shipped = new ShippedOrder("O102", "2025-09-18", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O103", "2025-09-17", "TRK67890", "2025-09-19");

        order.getOrderStatus();
        shipped.getOrderStatus();
        delivered.getOrderStatus();
    }
}
