package basics;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates_n_Time {

    // How to work with Dates and Time in Java
    // (LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, UTC and Time Zones)

    void main() {

        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now(); // UTC time

        System.out.println("Current Date and Time: " + dateTime);

        System.out.println("Current Instant (UTC): " + instant);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Comparing two dates

        LocalDateTime date1 = LocalDateTime.of(2025, 11, 15, 22, 37);
        LocalDateTime date2 = LocalDateTime.of(2021, 11, 14, 22, 40);

        if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are equal");
        } else {
            System.out.println("Date1 is before Date2");
        }

    }
}
