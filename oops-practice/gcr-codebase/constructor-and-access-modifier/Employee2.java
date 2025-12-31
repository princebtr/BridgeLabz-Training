// Problem Statement: Develop an Employee class with:
// employeeID (public).
// department (protected).
// salary (private).
// Write methods to:
// Modify salary using a public method.
// Create a subclass Manager to access employeeID and department.

class Employee2 {
    public int employeeID;
    protected String department;
    private double salary;

    Employee2(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee2 {
    Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    void display() {
        System.out.println(employeeID + " | " + department);
    }
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Sales", 75000.0);
        manager.display();
        System.out.println("Salary: " + manager.getSalary());
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}

