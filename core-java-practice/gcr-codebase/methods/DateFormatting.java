import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 

public class DateFormatting {
    public static void main(String[] args) {
        System.out.println("---Date Formatting---");

        // get the current system date
        LocalDate currentDate= LocalDate.now();

        // create formatter for dd/MM/yyyy format
        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // create formatter for yyyy-MM-dd format
        DateTimeFormatter format2= DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // create formatter for EEE, MMM dd, yyyy format
        DateTimeFormatter format3= DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("dd/MM/yyyy: "+ currentDate.format(format1));
        System.out.println("yyyy-MM-dd: "+ currentDate.format(format2));
        System.out.println("EEE, MMM dd, yyyy: "+ currentDate.format(format3));
    }
}
