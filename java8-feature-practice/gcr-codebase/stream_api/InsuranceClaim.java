import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;
    Claim(String type, double amount) { this.type = type; this.amount = amount; }
}

public class InsuranceClaim {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000), new Claim("Auto", 3000),
            new Claim("Health", 7000), new Claim("Life", 10000)
        );

        Map<String, Double> averages = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount))); // grouping and averaging

        System.out.println(averages);
    }
}