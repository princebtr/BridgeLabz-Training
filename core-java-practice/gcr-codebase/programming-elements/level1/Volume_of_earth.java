public class Volume_of_earth {
    public static void main(String[] args) {
        double radius = 6378; // in kilometers

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double cubicMiles = volume * 0.239913;

        System.out.printf(
            "The volume of Earth is %.2f cubic kilometers and %.2f cubic miles",
            volume, cubicMiles
        );
    }
}
