//Problem Statement: Library Book System: Create a Book class with attributes title, author, price, and availability. 
//Implement a method to borrow a book.

public class BorrowBook {
	String title;
	String author;
	int price;
	boolean availability;
	
	BorrowBook(String title, String author, int price, boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
//	method to borrow a book
	void borrow() {
		if(availability) {
			availability = false;
			System.out.println(title + " has been borrowed");
		} else {
			System.out.println(title + " is not available");
		}
	}
	public static void main(String[] args) {
		BorrowBook b1 = new BorrowBook("java","Gosling", 3000, true);
		b1.borrow();
	}

}
