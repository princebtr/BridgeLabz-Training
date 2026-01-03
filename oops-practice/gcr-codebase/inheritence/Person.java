// Superclass
class Person1 {
    protected String name;
    protected int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclasses
class Teacher extends Person1 {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher | Subject: " + subject);
    }
}

class Student extends Person1 {
    private String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student | Grade: " + grade);
    }
}

class Staff extends Person1 {
    private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Staff | Department: " + department);
    }
}
