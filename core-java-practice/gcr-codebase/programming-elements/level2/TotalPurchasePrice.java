import java.util.Scanner;
public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double up = sc.nextDouble();
        int q = sc.nextInt();

        double total = up * q;

        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + q +
                " and unit price is INR " + up);
    }
}
