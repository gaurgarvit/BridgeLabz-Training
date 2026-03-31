import java.util.Arrays;
import java.util.List;

public class NameTransformer {
    public static void main(String[] args) {
        List<String> customers = Arrays.asList("john", "alice", "bob");

        customers.stream()
            .map(String::toUpperCase) // converting to uppercase
            .sorted() // sorting alphabetically
            .forEach(System.out::println); // displaying results
    }
}