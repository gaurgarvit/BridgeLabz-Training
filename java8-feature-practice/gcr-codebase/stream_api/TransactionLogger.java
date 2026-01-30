import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TransactionLogger {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");

        transactionIds.forEach(id -> 
            System.out.println(LocalDateTime.now() + " Transaction: " + id)); // printing id with time
    }
}