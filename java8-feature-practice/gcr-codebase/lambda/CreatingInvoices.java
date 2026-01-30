
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    int transactionId;

    // Constructor
    public Invoice(int transactionId) {
        this.transactionId = transactionId;
        System.out.println("Generated Invoice for Transaction ID: " + transactionId);
    }
}

public class CreatingInvoices {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003, 1004);

        System.out.println("--- Processing Invoices ---");

        // Converting list of IDs to List of Invoice objects using Constructor Reference
        List<Invoice> invoiceList = transactionIds.stream()
                                                  .map(Invoice::new) // Constructor reference
                                                  .collect(Collectors.toList());
    }
}