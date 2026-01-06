// Problem Statement: Student Report Generator
// Scenario: You need to generate a report card for students based on subject-wise marks.
// Problem Requirements:
// ● Store subjects and marks using arrays.
// ● Use a List to store multiple student records.
// ● Use methods for calculating average, grade assignment, and displaying result.
// ● Validate marks (should be 0–100), else throw InvalidMarkException.
// ● Format output strings to show a clean report card.

import java.util.*;
public class StudentReportGenerator {

    String[] subjects = {"Maths", "Science", "English", "Computer"};
    List<Integer> averages = new ArrayList<>();

    public boolean validateMarks(int[] marks) {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid Marks");
                return false;
            }
        }
        return true;
    }

    public int calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public String assignGrade(int avg) {
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "D";
    }

    public void displayReport(String name, int[] marks, int avg, String grade) {
        System.out.println("\n----- Report Card -----");
        System.out.println("Student Name : " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
        System.out.println("Average : " + avg);
        System.out.println("Grade   : " + grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentReportGenerator sr = new StudentReportGenerator();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        int[] marks = new int[sr.subjects.length];

        for (int i = 0; i < sr.subjects.length; i++) {
            System.out.print("Enter marks for " + sr.subjects[i] + ": ");
            marks[i] = input.nextInt();
        }

        if (sr.validateMarks(marks)) {
            int avg = sr.calculateAverage(marks);
            String grade = sr.assignGrade(avg);
            sr.displayReport(name, marks, avg, grade);
        }
    }
}
