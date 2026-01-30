interface PaymentProcessor {
    void processPayment();

    // Default method - does not force implementation classes to override
    default void refund() {
        System.out.println("Refund functionality not yet implemented for this provider.");
    }
}

class OldProvider implements PaymentProcessor {
    public void processPayment() {
        System.out.println("Processing via Old Provider...");
    }
    // No refund method needed here, code still compiles
}

class NewProvider implements PaymentProcessor {
    public void processPayment() {
        System.out.println("Processing via New Provider...");
    }
    @Override
    public void refund() {
        System.out.println("Refund processed via New Provider API.");
    }
}

public class IntegratingGateways {
    public static void main(String[] args) {
        PaymentProcessor oldP = new OldProvider();
        oldP.processPayment();
        oldP.refund(); // Uses default

        System.out.println("---");

        PaymentProcessor newP = new NewProvider();
        newP.processPayment();
        newP.refund(); // Uses overridden
    }
}