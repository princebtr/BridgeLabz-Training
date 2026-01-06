//Problem Statement: Employee Management System
//Description: Build an employee management system with the following requirements:
//Use an abstract class Employee with fields like employeeId, name, and baseSalary.
//Provide an abstract method calculateSalary() and a concrete method displayDetails().
//Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
//Use encapsulation to restrict direct access to fields and provide getter and setter methods.
//Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
//Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

import java.util.*;
public interface Department {
	void assignDepeartment();
	void getDepartmentDetails();
}

abstract class Employee5{
	private int employeeId;
	private String name;
	private int baseSalary;
//	Constructor
	Employee5(String name, int employeeId, int baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
//	Setter method
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
//	Getter Method
	public int getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	abstract void calculateSalary();
	void getDepartmentDetails() {
		System.out.println("Employee Id : "+employeeId+"\nName : "+name+"\nBase Salary : "+baseSalary);
	}
}

class FullTimeEmployee extends Employee5 implements Department{
	int fixedSalary;
	String assignedDepartment;
	FullTimeEmployee(String employeeId, int name, int baseSalary, int fixedSalary){
		super(employeeId,name,baseSalary);
		this.fixedSalary = fixedSalary;
	}
	@Override
	public void assignDepeartment() {
		String[] departments = {"HR","Finance","IT","Marketing","Operations"};
	        int randomIndex = (int) (Math.random() * 5);
	        assignedDepartment = departments[randomIndex];
	    }
	@Override
	public void getDepartmentDetails() {
		System.out.println("Employee has been assigned to Department: "+assignedDepartment);
	}
	@Override
	void calculateSalary() {
		System.out.println("Salary of this full time employee is : "+(getBaseSalary()+fixedSalary));
	}
}
class PartTimeEmployee extends Employee5 implements Department{
	int workHour;
	String assignedDepartment;
	PartTimeEmployee(String employeeId, int name, int baseSalary, int workHour){
		super(employeeId,name,baseSalary);
		this.workHour = workHour;
	}
	@Override
	public void assignDepeartment() {
		String[] departments = {"HR","Finance","IT","Marketing","Operations"};
	        int randomIndex = (int) (Math.random() * 5);
	        assignedDepartment = departments[randomIndex];
	    }
	@Override
	public void getDepartmentDetails() {
		System.out.println("Employee has been assigned to Department: "+assignedDepartment);
	}
	@Override
	void calculateSalary() {
		System.out.println("Salary of this part time employee is : "+(getBaseSalary()*workHour));
	}
}
class Main {
	public static void main(String[] args) {
        ArrayList<Employee5> employees = new ArrayList<>();

        Employee5 e1 = new FullTimeEmployee("Prince", 101, 30000, 15000);
        Employee5 e2 = new PartTimeEmployee("Rahul", 102, 500, 40);

        employees.add(e1);
        employees.add(e2);

        for (Employee5 emp : employees) {
            emp.getDepartmentDetails();
            emp.calculateSalary();

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                dept.assignDepeartment();
                dept.getDepartmentDetails();
            }

        }
    }
}