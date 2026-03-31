import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    String customer;
    double total;
    Order(String customer, double total) { this.customer = customer; this.total = total; }
}

public class OrderRevenue {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Cust1", 150.0), new Order("Cust2", 200.0),
            new Order("Cust1", 50.5), new Order("Cust3", 300.0)
        );

        // summing order totals per customer
        Map<String, Double> revenueSummary = orders.stream()
            .collect(Collectors.groupingBy(
                o -> o.customer,
                Collectors.summingDouble(o -> o.total) // summing order values
            ));

        System.out.println(revenueSummary);
    }
}