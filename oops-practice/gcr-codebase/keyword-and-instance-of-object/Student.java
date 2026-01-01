public class Student {

    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        }
    }

    void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Hemashree", "A");
        Student s2 = new Student(102, "Sharmila", "B");

        displayTotalStudents();
        s1.displayStudentDetails(s1);
        s2.displayStudentDetails(s2);

        s2.updateGrade(s2, "A");
        s2.displayStudentDetails(s2);
    }
}
