import java.util.Scanner;
public class CompareBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter height (cm): ");
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0);

            double heightInMeters = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        scanner.close();
    }
}
