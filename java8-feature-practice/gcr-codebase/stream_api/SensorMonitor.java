import java.util.Arrays;
import java.util.List;

public class SensorMonitor {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 88, 92, 30);
        int threshold = 80;

        readings.stream()
            .filter(r -> r > threshold) // filtering high readings
            .forEach(r -> System.out.println("Warning: High Reading: " + r)); // printing warnings
    }
}