import java.util.Scanner;

public class Km_to_miles_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mi = km * 0.621371;
        System.out.println("The distance  "+km+" km in miles is "+mi);
    }
}
