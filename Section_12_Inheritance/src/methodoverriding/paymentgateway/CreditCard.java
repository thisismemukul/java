package methodoverriding.paymentgateway;

public class CreditCard extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}
