import java.util.Arrays;
import java.util.List;

public class StockLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(150.20, 155.45, 149.80);
        
        stockPrices.forEach(price -> System.out.println("Current Stock Price: " + price)); // printing each price
    }
}