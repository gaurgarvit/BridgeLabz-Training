import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class FilteringNotifications {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Patient ID 101 Discharged", "Info"));
        alerts.add(new Alert("ICU Bed 4 Oxygen Low", "Critical"));
        alerts.add(new Alert("Staff Meeting at 4 PM", "Info"));
        alerts.add(new Alert("Emergency Ward Full", "Critical"));

        // Predicate to filter only Critical alerts
        Predicate<Alert> isCritical = (alert) -> "Critical".equals(alert.type);

        System.out.println("--- Critical Alerts ---");
        for (Alert alert : alerts) {
            if (isCritical.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}