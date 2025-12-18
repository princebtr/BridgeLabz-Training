import java.util.Scanner;
public class kilometers_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = 10.8;
        double mi = km * 0.621371;
        System.out.println("The distance  "+km+" km in miles is "+mi);
    }
}
