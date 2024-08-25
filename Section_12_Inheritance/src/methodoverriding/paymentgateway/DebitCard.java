package methodoverriding.paymentgateway;

public class DebitCard extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing debit card payment of ₹" + amount);
    }
}
