import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatIso(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_DATE);
    }
}

public class FormattingDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        System.out.println("Formatted Date: " + DateUtils.formatIso(today));
    }
}