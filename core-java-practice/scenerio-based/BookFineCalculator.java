//Problem Statement: * Rohan’s Library Reminder App 📚
//Rohan wants a fine calculator:
//● Input return date and due date.
//● If returned late, calculate fine: ₹5/day.
//● Repeat for 5 books using for-loop.

import java.util.Scanner;
public class BookFineCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter Due Date (day): ");
            int dueDate = input.nextInt();

            System.out.print("Enter Return Date (day): ");
            int returnDate = input.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }

        input.close();
    }
}
