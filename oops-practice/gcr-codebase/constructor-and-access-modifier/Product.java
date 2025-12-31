//Problem Statement: Create a Product class with:
//	Instance Variables: productName, price.
//	Class Variable: totalProducts (shared among all products).
//	Methods:
//	An instance method displayProductDetails() to display the details of a product.
//	A class method displayTotalProducts() to show the total number of products created.

class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 75000);
		Product p2 = new Product("Smartphone", 30000);

		p1.displayProductDetails();
		p2.displayProductDetails();

		Product.displayTotalProducts();
	}
}

