import java.util.Scanner;
public class CompareGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        String[] remarks = new String[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();

            // Calculate total and percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Determine grade and remarks
            if (percentage[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
                remarks[i] = "Level 2, below but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println("Remarks   : " + remarks[i]);
            System.out.println();
        }

        sc.close();
    }
}
