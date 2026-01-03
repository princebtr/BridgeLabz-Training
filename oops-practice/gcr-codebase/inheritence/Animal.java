//Problem Statement: Animal Hierarchy
//Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
//Tasks:
//Define a superclass Animal with attributes name and age, and a method makeSound().
//Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
//Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes

public class Animal {
	String name;
	int age;
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	void makeSound() {
		System.out.println("Animal is making sound");
	}
	public static void main(String[] args) {
		Animal a = new Animal("Grok",34);
		Dog d = new Dog("Husky",7);
		Cat c = new Cat("Daisy",4);
		Bird b = new Bird("Rosy",2);
		
		a.makeSound();
		b.makeSound();
		c.makeSound();
		d.makeSound();
	}

}
class Dog extends Animal {
	Dog(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound() {
		System.out.println("Bark");
	}
}
class Bird extends Animal{
	Bird(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound() {
		System.out.println("Chirp");
	}
}
class Cat extends Animal{
	Cat(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound() {
		System.out.println("Meow");
	}
}
