import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("dd/MM/yyyy format       : " + today.format(f1));
        System.out.println("yyyy-MM-dd format       : " + today.format(f2));
        System.out.println("EEE, MMM dd, yyyy format: " + today.format(f3));
    }
}
