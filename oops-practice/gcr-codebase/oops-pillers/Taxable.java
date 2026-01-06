//Problem Statement: E-Commerce Platform
//Description: Develop a simplified e-commerce platform:
//Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
//Extend it into concrete classes: Electronics, Clothing, and Groceries.
//Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
//Use encapsulation to protect product details, allowing updates only through setter methods.
//Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.

import java.util.*;

interface Taxable {
	void calculateTax();
	void getTaxDetails();
}

abstract class Product{
	private int productId;
	private String name;
	private double price;
//	Constructor
	Product(int productId, String name, double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
//	Setter Methods
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	Getter Methods
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable{
	double tax;
	Electronics(int productId, String name, double price){
		super(productId,name,price);
	}
	@Override
	double calculateDiscount() {
		return getPrice() * 0.10;
	}
	@Override
	public void calculateTax() {
		tax = getPrice() * 0.18;
	}
	@Override
	public void getTaxDetails() {
		System.out.println("Electronics Tax : "+tax);
	}
}

class Clothing extends Product implements Taxable{
	double tax;
	Clothing(int productId, String name, double price){
		super(productId,name,price);
	}
	@Override
	double calculateDiscount() {
		return getPrice() * 0.20;
	}
	@Override
	public void calculateTax() {
		tax = getPrice() * 0.12;
	}
	@Override
	public void getTaxDetails() {
		System.out.println("Clothing Tax : "+tax);
	}
}

class Groceries extends Product{
	Groceries(int productId, String name, double price){
		super(productId,name,price);
	}
	@Override
	double calculateDiscount() {
		return getPrice() * 0.05;
	}
}

class Main{
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		
		Product p1 = new Electronics(101,"Laptop",60000);
		Product p2 = new Clothing(102,"Shirt",2000);
		Product p3 = new Groceries(103,"Rice",1500);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		for(Product p : products) {
			double tax = 0;
			double discount = p.calculateDiscount();
			
			if(p instanceof Taxable) {
				Taxable t = (Taxable) p;
				t.calculateTax();
				t.getTaxDetails();
				if(p instanceof Electronics) {
					tax = ((Electronics)p).tax;
				}
				if(p instanceof Clothing) {
					tax = ((Clothing)p).tax;
				}
			}
			
			double finalPrice = p.getPrice() + tax - discount;
			System.out.println("Final Price of "+p.getName()+" : "+finalPrice);
		}
	}
}
