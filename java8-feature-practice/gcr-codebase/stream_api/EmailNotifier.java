import java.util.Arrays;
import java.util.List;

public class EmailNotifier {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("user1@test.com", "user2@test.com");

        emails.forEach(email -> sendEmail(email)); // sending email to each user
    }

    static void sendEmail(String email) {
        System.out.println("Email sent to: " + email);
    }
}