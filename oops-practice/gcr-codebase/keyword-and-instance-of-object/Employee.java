public class Employee {

    static String companyName = "Tech Solutions Inc.";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Designation: " + e.designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee e2 = new Employee(102, "Rohan", "Project Manager");

        displayTotalEmployees();
        e1.displayEmployeeDetails(e1);
        e2.displayEmployeeDetails(e2);
    }
}
