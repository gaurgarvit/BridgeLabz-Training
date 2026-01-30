interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via UPI interface.");
    }
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card (Auth required).");
    }
}

public class ProcessingPayments {
    public static void main(String[] args) {
        PaymentMethod gateway = new UPI();
        gateway.pay(150.00);

        gateway = new CreditCard();
        gateway.pay(99.99);
    }
}