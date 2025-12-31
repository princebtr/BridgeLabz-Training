// Problem Statement: University Management System
// Create a Student class with:
// rollNumber (public).
// name (protected).
// CGPA (private).
// Write methods to:
// Access and modify CGPA using public methods.
// Create a subclass PostgraduateStudent to demonstrate the use of protected members.

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public methods for private variable
    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void display() {
        System.out.println(rollNumber + " | " + name);
    }
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "John Doe", 8.5);
        pgStudent.display();
        System.out.println("CGPA: " + pgStudent.getCGPA());
        pgStudent.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
