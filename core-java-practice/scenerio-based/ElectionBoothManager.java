// Problem Statement: Election Booth Manager ️
// Design a polling booth system.
// take age input.
// Use if to check if eligible (>=18).
// Record vote (1, 2, or 3 for candidates).
// Loop for multiple voters, exit on special code.

import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("Enter your age (or -1 to exit): ");
            int age = input.nextInt();
            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.print("Enter your vote (1, 2, or 3 for candidates): ");
                int vote = input.nextInt();
                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        System.out.println("Vote recorded for Candidate 1.");
                        break;
                    case 2:
                        candidate2Votes++;
                        System.out.println("Vote recorded for Candidate 2.");
                        break;
                    case 3:
                        candidate3Votes++;
                        System.out.println("Vote recorded for Candidate 3.");
                        break;
                    default:
                        System.out.println("Invalid vote. Please vote for 1, 2, or 3.");
                }
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        System.out.println("Voting ended.");
        System.out.println("Candidate 1 received: " + candidate1Votes + " votes.");
        System.out.println("Candidate 2 received: " + candidate2Votes + " votes.");
        System.out.println("Candidate 3 received: " + candidate3Votes + " votes.");
    }
}