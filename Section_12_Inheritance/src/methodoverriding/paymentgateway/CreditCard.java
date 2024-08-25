package methodoverriding.paymentgateway;

public class CreditCard extends Payment{

    @Override
    void validateDetails() {
        System.out.println("Validating credit card payment");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}
