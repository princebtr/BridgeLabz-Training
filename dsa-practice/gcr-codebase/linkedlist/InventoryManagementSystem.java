class ItemNode {
    int id, quantity;
    String name;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryList {
    ItemNode head;

    void addItem(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    void updateQuantity(int id, int qty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = qty;
                return;
            }
            temp = temp.next;
        }
    }

    double totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " : " + temp.quantity);
            temp = temp.next;
        }
    }
}
