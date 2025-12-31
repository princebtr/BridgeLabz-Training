//Problem Statement: Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

public class Book {
	String title;
	String author;
	int price;
	Book(){
		title = "";
		author = "";
		price = 0;
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
		System.out.println("Title : "+title+"\nAuthor : "+author+"\nPrice : "+price);
	}
	public static void main(String[] args) {
		Book java = new Book();
		java.display();
		
		Book java2 = new Book("Java", "Gosling" , 2000);
		java2.display();
	}
}
