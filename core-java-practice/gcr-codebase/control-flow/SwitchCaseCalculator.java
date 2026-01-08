// Problem Statement: Write a program to create a calculator using switch...case.

import java.util.Scanner;
public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        String op = scanner.next();

        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
