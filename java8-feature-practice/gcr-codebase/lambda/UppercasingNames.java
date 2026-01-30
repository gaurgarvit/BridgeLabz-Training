import java.util.Arrays;
import java.util.List;

public class UppercasingNames {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Garvit", "Amit", "Sneha", "Rahul");

        System.out.println("--- Formatted Employee List ---");
        
        // Using Stream and Method Reference
        employees.stream()
                 .map(String::toUpperCase) // Method reference
                 .forEach(System.out::println);
    }
}