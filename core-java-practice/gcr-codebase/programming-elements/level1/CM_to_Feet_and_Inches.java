import java.util.Scanner;
public class CM_to_Feet_and_Inches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double centimeters = sc.nextDouble();

        double inchesTotal = centimeters / 2.54;
        int feet = (int) (inchesTotal / 12);
        double inches = inchesTotal % 12;

        System.out.printf("Your Height in cm is "+centimeters+" while in feet is "+feet+" and inches is "+ inches);
    }
}
