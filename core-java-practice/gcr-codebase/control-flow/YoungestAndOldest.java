// Problem Statement: Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;
public class YoungestAndOldest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age of Amar:");
        int ageAmar = input.nextInt();
        System.out.println("Enter the height of Amar (in cm):");
        int heightAmar = input.nextInt();

        System.out.println("Enter the age of Akbar:");
        int ageAkbar = input.nextInt();
        System.out.println("Enter the height of Akbar (in cm):");
        int heightAkbar = input.nextInt();

        System.out.println("Enter the age of Anthony:");
        int ageAnthony = input.nextInt();
        System.out.println("Enter the height of Anthony (in cm):");
        int heightAnthony = input.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("The youngest friend is Amar with age: " + ageAmar);
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("The youngest friend is Akbar with age: " + ageAkbar);
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("The youngest friend is Anthony with age: " + ageAnthony);
        } else {
            System.out.println("There is a tie for the youngest friend.");
        }

        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("The tallest friend is Amar with height: " + heightAmar + " cm");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("The tallest friend is Akbar with height: " + heightAkbar + " cm");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("The tallest friend is Anthony with height: " + heightAnthony + " cm");
        } else {
            System.out.println("There is a tie for the tallest friend.");
        }
    }
}
