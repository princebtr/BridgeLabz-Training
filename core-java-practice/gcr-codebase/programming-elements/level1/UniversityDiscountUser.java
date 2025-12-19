import java.util.Scanner;
public class UniversityDiscountUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int dis = sc.nextInt();
        double disfee = (dis / 100.0) * fee;
        double finalFee = fee - disfee;
        System.out.println("The discount amount is INR "+disfee+" and final discounted fee is INR "+finalFee);
    }
}
