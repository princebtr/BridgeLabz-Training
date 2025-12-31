class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        }
    }

    void displayTotalCost() {
        System.out.println("Total cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.itemName = "Laptop";
        item.price = 999.99;
        item.quantity = 1;

        System.out.println("Item: " + item.itemName + ", Price: $" + item.price + ", Quantity: " + item.quantity);
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
