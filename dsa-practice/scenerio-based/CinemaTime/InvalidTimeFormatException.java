package CinemaTime;

// Custom Exception for invalid time format
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}