import java.util.Scanner;
public class SideOfSquare {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double s = p / 4;

        System.out.println("The length of the side is " + s +
                " whose perimeter is " + p);
    }
}
