// Problem Statement: find the sum until the user enters 0 or a negative number using while loop and break statement.

import java.util.Scanner;
public class SumTillZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double userEnteredValue;

        while (true) {
            userEnteredValue = input.nextDouble();
            if (userEnteredValue <= 0) {
                break;
            }
            total += userEnteredValue;
        }

        System.out.println(total);
    }
}
