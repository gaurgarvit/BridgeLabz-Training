import java.util.function.Predicate;

public class MonitoringTemperature {
    public static void main(String[] args) {
        // Predicate returns true or false based on input
        Predicate<Double> isCritical = (temp) -> temp > 100.0;

        double currentTemp = 105.5;

        if (isCritical.test(currentTemp)) {
            System.out.println("ALERT! Temperature " + currentTemp + " is critical.");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}