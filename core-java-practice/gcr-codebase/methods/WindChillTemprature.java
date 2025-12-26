// Problem Statement: Write a program calculate the wind chill temperature given the temperature and wind speed
// Hint => 
// Write a method to calculate the wind chill temperature using the formula 
// windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
// public double calculateWindChill(double temperature, double windSpeed)

import java.util.Scanner;
public class WindChillTemprature {
    public static double calculateWindChill(double temperature, double windSpeed) { 
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("The Wind Chill Temperature is: " + windChill);

        input.close();
    }
}
