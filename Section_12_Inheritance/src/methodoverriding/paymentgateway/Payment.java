package methodoverriding.paymentgateway;

public class Payment {
    void processPayment(double amount) {
        System.out.println("Processing a generic payment of ₹" + amount);
    }
}
