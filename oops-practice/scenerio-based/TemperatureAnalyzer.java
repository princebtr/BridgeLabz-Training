// Problem Satement: Arrays – Temperature Analyzer
//  1. Scenario: You're analyzing a week’s worth of hourly temperature data stored in a 2D array
// (float[7][24]).
// Problem:
// Write a method to:
//  ● Find the hottest and coldest day,
//  ● Return average temperature per day.

//  2. Scenario: Develop a program to manage student test scores. The program should:
//  ● Store the scores of n students in an array.
//  ● Calculate and display the average score.
//  ● Find and display the highest and lowest scores.
//  ● Identify and display the scores above the average.
//  ● Handle invalid input like negative scores or non-numeric input.

public class TemperatureAnalyzer {
    public static void analyzeTemperature(float[][] temp) {

        float hottestAvg = Float.MIN_VALUE;
        float coldestAvg = Float.MAX_VALUE;
        int hottestDay = 0;
        int coldestDay = 0;

        System.out.println("Average Temperature per Day:");

        for (int day = 0; day < temp.length; day++) {
            float sum = 0;

            for (int hour = 0; hour < temp[day].length; hour++) {
                sum += temp[day][hour];
            }

            float avg = sum / temp[day].length;
            System.out.println("Day " + (day + 1) + ": " + avg);

            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = day + 1;
            }

            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = day + 1;
            }
        }

        System.out.println("\nHottest Day: Day " + hottestDay);
        System.out.println("Coldest Day: Day " + coldestDay);
    }

    public static void main(String[] args) {

        float[][] temperatures = new float[7][24];

        // Sample data
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temperatures[i][j] = 20 + (float)(Math.random() * 15);
            }
        }

        analyzeTemperature(temperatures);
    }
}
