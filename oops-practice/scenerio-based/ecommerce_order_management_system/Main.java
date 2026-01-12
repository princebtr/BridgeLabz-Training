//E-Commerce Order Management System
//Real Scenario
//Users browse products, place orders, cancel them, and track delivery.Key Features
//Product catalog
//Order placement
//Order cancellation
//Payment processing
//Concepts Used
//OOP: Product, Order, Customer
//Interface: Payment (Card, UPI, Wallet)
//Polymorphism: Different payment behaviors
//Exception Handling: PaymentFailedException

package ecommerce_order_management_system;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		OrderManagement o = new OrderManagement();

		Product p1  = new Product("Laptop", "Electronics", "15-inch", 65000.00);
		Product p2  = new Product("Smartphone", "Electronics", "6.5-inch", 32000.00);
		Product p3  = new Product("Refrigerator", "Appliances", "300-Litre", 28000.00);
		Product p4  = new Product("Washing Machine", "Appliances", "7-kg", 22000.00);
		Product p5  = new Product("Running Shoes", "Footwear", "Size-9", 4500.00);
		Product p6  = new Product("Office Chair", "Furniture", "Medium", 8500.00);
		Product p7  = new Product("Backpack", "Accessories", "35-Litre", 1800.00);
		Product p8  = new Product("Smart Watch", "Wearables", "42-mm", 12000.00);
		Product p9  = new Product("Coffee Maker", "Kitchen", "1.5-Litre", 6500.00);
		Product p10 = new Product("Bookshelf", "Furniture", "5-Shelf", 11000.00);

		o.addProduct(p1);
		o.addProduct(p2);
		o.addProduct(p3);
		o.addProduct(p4);
		o.addProduct(p5);
		o.addProduct(p6);
		o.addProduct(p7);
		o.addProduct(p8);
		o.addProduct(p9);
		o.addProduct(p10);

		
		System.out.println("Enter Name : ");
		String name = input.next();
		
		System.out.println("Enter Email : ");
		String email = input.next();
		
		User u = new User(name,email);
		PaymentType pt = new PaymentType(u,"Card",2000000,5000000);
		
		o.purchase(pt);
	}

}
