// PRoblem Statement: Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

import java.util.Scanner;
public class SpringSeason {
    // Method to check if the date is in Spring Season
    public static boolean checkSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        boolean isSpring = checkSpringSeason(month, day);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        input.close();
    }
}
