import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random PCM marks (2-digit)
    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90); // Physics
            marks[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to find grade based on percentage
    public static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {
            char grade = getGrade(result[i][2]);

            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grade
            );
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        int[][] marks = generatePCMMarks(students);
        double[][] result = calculateResults(marks);
        displayScoreCard(marks, result);

        input.close();
    }
}
