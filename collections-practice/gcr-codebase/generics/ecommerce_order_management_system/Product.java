package ecommerce_order_management_system;

public class Product {
	private int productId;
	private String productName;
	private String productType;
	private String productSize;
	private double price;
	private static int counter = 0;
	public Product(String productName, String productType, String productSize, double price) {
		this.productId = counter++;
		this.productName = productName;
		this.productType = productType;
		this.productSize = productSize;
		this.price = price;
	}
	public int getProductID() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductType() {
		return productType;
	}
	public String getProductSize() {
		return productSize;
	}
	public double getPrice() {
		return price;
	}
	public double calculateBill(int qty) {
		return price*qty;
	}
}
