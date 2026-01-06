//Problem Statement: Library Management System
//Description: Develop a library management system:
//Use an abstract class LibraryItem with fields like itemId, title, and author.
//Add an abstract method getLoanDuration() and a concrete method getItemDetails().
//Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
//Implement an interface Reservable with methods reserveItem() and checkAvailability().
//Apply encapsulation to secure details like the borrower’s personal data.
//Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.

import java.util.*;

interface Reservable {
	void reserveItem();
	void checkAvailability();
}

abstract class LibraryItem{
	private int itemId;
	private String title;
	private String author;
//	Constructor
	LibraryItem(int itemId, String title, String author){
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}
//	Setter Methods
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
//	Getter Methods
	public int getItemId() {
		return itemId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
//	Concrete Method
	void getItemDetails() {
		System.out.println("Item Id : "+itemId);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
	}
//	Abstract Method
	abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable{
	private String borrowerName;
	boolean available = true;
	Book(int itemId, String title, String author){
		super(itemId,title,author);
	}
	@Override
	int getLoanDuration() {
		return 14;
	}
	@Override
	public void reserveItem() {
		if(available) {
			available = false;
			System.out.println("Book Reserved Successfully");
		} else {
			System.out.println("Book Not Available");
		}
	}
	@Override
	public void checkAvailability() {
		System.out.println("Book Availability : "+available);
	}
}

class Magazine extends LibraryItem implements Reservable{
	private String borrowerName;
	boolean available = true;
	Magazine(int itemId, String title, String author){
		super(itemId,title,author);
	}
	@Override
	int getLoanDuration() {
		return 7;
	}
	@Override
	public void reserveItem() {
		if(available) {
			available = false;
			System.out.println("Magazine Reserved Successfully");
		} else {
			System.out.println("Magazine Not Available");
		}
	}
	@Override
	public void checkAvailability() {
		System.out.println("Magazine Availability : "+available);
	}
}

class DVD extends LibraryItem implements Reservable{
	private String borrowerName;
	boolean available = true;
	DVD(int itemId, String title, String author){
		super(itemId,title,author);
	}
	@Override
	int getLoanDuration() {
		return 3;
	}
	@Override
	public void reserveItem() {
		if(available) {
			available = false;
			System.out.println("DVD Reserved Successfully");
		} else {
			System.out.println("DVD Not Available");
		}
	}
	@Override
	public void checkAvailability() {
		System.out.println("DVD Availability : "+available);
	}
}

class Main{
	public static void main(String[] args) {
		ArrayList<LibraryItem> items = new ArrayList<>();
		
		LibraryItem i1 = new Book(101,"Java Programming","James Gosling");
		LibraryItem i2 = new Magazine(102,"Tech Today","Editorial Team");
		LibraryItem i3 = new DVD(103,"Inception","Christopher Nolan");
		
		items.add(i1);
		items.add(i2);
		items.add(i3);
		
		for(LibraryItem item : items) {
			item.getItemDetails();
			System.out.println("Loan Duration : "+item.getLoanDuration()+" days");
			
			if(item instanceof Reservable) {
				Reservable r = (Reservable) item;
				r.checkAvailability();
				r.reserveItem();
				r.checkAvailability();
			}
		}
	}
}
