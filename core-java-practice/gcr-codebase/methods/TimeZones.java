import java.time.ZoneId;
import java.time.ZonedDateTime; 

public class TimeZones {
    public static void main(String[] args) {
        System.out.println("Current time in different time zones:");

        // get current date and time in GMT (Greenwich Mean Time)
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // get current date and time in IST (India Standard Time)
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // get current date and time in PST (Pacific Standard Time)
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}
