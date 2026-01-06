//Problem Statement: Online Food Delivery System
//Description: Create an online food delivery system:
//Define an abstract class FoodItem with fields like itemName, price, and quantity.
//Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
//Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
//Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
//Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.

import java.util.*;

interface Discountable {
	void applyDiscount();
	void getDiscountDetails();
}

abstract class FoodItem{
	private String itemName;
	private double price;
	private int quantity;
//	Constructor
	FoodItem(String itemName, double price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
//	Setter Methods
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
//	Getter Methods
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
//	Concrete Method
	void getItemDetails() {
		System.out.println("Item Name : "+itemName);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
	}
//	Abstract Method
	abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable{
	double discount;
	VegItem(String itemName, double price, int quantity){
		super(itemName,price,quantity);
	}
	@Override
	double calculateTotalPrice() {
		return getPrice() * getQuantity();
	}
	@Override
	public void applyDiscount() {
		discount = calculateTotalPrice() * 0.10;
	}
	@Override
	public void getDiscountDetails() {
		System.out.println("Veg Item Discount : "+discount);
	}
}

class NonVegItem extends FoodItem implements Discountable{
	double discount;
	double extraCharge = 50;
	NonVegItem(String itemName, double price, int quantity){
		super(itemName,price,quantity);
	}
	@Override
	double calculateTotalPrice() {
		return (getPrice() * getQuantity()) + extraCharge;
	}
	@Override
	public void applyDiscount() {
		discount = calculateTotalPrice() * 0.05;
	}
	@Override
	public void getDiscountDetails() {
		System.out.println("Non-Veg Item Discount : "+discount);
	}
}

class Main{
	public static void main(String[] args) {
		ArrayList<FoodItem> order = new ArrayList<>();
		
		FoodItem f1 = new VegItem("Paneer Butter Masala",250,2);
		FoodItem f2 = new NonVegItem("Chicken Biryani",300,1);
		
		order.add(f1);
		order.add(f2);
		
		for(FoodItem item : order) {
			item.getItemDetails();
			double total = item.calculateTotalPrice();
			
			if(item instanceof Discountable) {
				Discountable d = (Discountable) item;
				d.applyDiscount();
				d.getDiscountDetails();
				if(item instanceof VegItem) {
					total -= ((VegItem)item).discount;
				}
				if(item instanceof NonVegItem) {
					total -= ((NonVegItem)item).discount;
				}
			}
			
			System.out.println("Final Price : "+total);
		}
	}
}
