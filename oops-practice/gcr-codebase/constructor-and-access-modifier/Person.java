//Problem Statement: Create a Person class with a copy constructor that clones another person's attributes.

public class Person {
	String name;
	Person(String name){
		this.name = name;
	}
	Person(Person p){
		this.name = p.name;
	}
	void display() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Person p1 = new Person("Raju");
		Person p2 = new Person(p1);
		
		p2.display();
	}

}
