import java.util.Arrays;
import java.util.List;

public class WelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Mark", "Sarah", "Kevin");

        attendees.forEach(name -> System.out.println("Welcome, " + name + "!")); // printing welcome message
    }
}