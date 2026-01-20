package CinemaTime;

// Main class
public class CinemaTimeMain {
    public static void main(String[] args) {

        CinemaTime cinema = new CinemaTime();

        try {
            cinema.addMovie("Inception", "18:30");
            cinema.addMovie("Interstellar", "21:00");
            cinema.addMovie("Avatar", "25:99"); // invalid time
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        cinema.displayAllMovies();

        cinema.searchMovie("Inter");

        cinema.generateReport();
    }
}
