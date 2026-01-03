//Problem Statement: Employee Management System
//Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
//Tasks:
//Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
//Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
//Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.

public class Employee {
	String name;
	int id;
	int salary;
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails() {
//		System.out.println();
		System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Raju",1,45000);
		Manager m1 = new Manager("Sibu",2,50000,7);
		Developer d1 = new Developer("Raushan",3,60000,"Java");
		Intern i1 = new Intern("Raut",4,1000,6);
		
		e1.displayDetails();
		m1.displayDetails();
		d1.displayDetails();
		i1.displayDetails();
	}

}
class Manager extends Employee {
	int teamSize;
	Manager(String name, int id, int salary,int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	@Override
	void displayDetails() {
		System.out.println();
		System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary+"\nTeam Size : "+teamSize);
	}
}
class Developer extends Employee {
	String language;
	Developer(String name, int id, int salary,String language){
		super(name,id,salary);
		this.language = language;
	}
	@Override
	void displayDetails() {
		System.out.println();
		System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary+"\nProgramming Language : "+language);
	}
}
class Intern extends Employee {
	int dur;
	Intern(String name, int id, int salary,int dur){
		super(name,id,salary);
		this.dur = dur;
	}
	@Override
	void displayDetails() {
		System.out.println();
		System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+salary+"\nInternship Duration : "+dur);
	}
}