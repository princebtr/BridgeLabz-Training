// Base class
class Order {
    protected String orderId;
    protected String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
    
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("ORD123","01-Jan-2026","TRK987","05-Jan-2026");
        System.out.println(order.getOrderStatus());
    }
}

// Intermediate class
class ShippedOrder extends Order {
    protected String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

// Derived class
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

