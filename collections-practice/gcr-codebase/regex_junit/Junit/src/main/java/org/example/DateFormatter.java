package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDate(String inputDate) {
        // parsing the input string into a date object
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // formatting the date object into the desired string format
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}