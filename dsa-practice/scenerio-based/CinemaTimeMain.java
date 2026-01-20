import java.util.ArrayList;
import java.util.List;

// Custom Exception for invalid time format
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

// Main manager class
class CinemaTime {

    // List to store movie titles
    private List<String> movieTitles = new ArrayList<>();

    // List to store showtimes
    private List<String> showTimes = new ArrayList<>();

    // Add a movie with validation
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }

        movieTitles.add(title);
        showTimes.add(time);

        System.out.println("Movie added: " + title + " at " + time);
    }

    // Search movie by keyword
    public void searchMovie(String keyword) {
        boolean found = false;

        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).contains(keyword)) {
                    String result = movieTitles.get(i) + " - " + showTimes.get(i);
                    System.out.println("Found: " + result);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No movie found with keyword: " + keyword);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Search error: Invalid index accessed");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled");
            return;
        }

        for (int i = 0; i < movieTitles.size(); i++) {
            String info = String.format("Movie: %s | Time: %s",
                    movieTitles.get(i), showTimes.get(i));
            System.out.println(info);
        }
    }

    // Generate printable report using array
    public void generateReport() {
        String[] reportArray = movieTitles.toArray(new String[0]);

        System.out.println("\nPrintable Movie Report:");
        for (int i = 0; i < reportArray.length; i++) {
            System.out.println(reportArray[i] + " at " + showTimes.get(i));
        }
    }

    // Validate time in HH:MM format
    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) {
            return false;
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}

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
