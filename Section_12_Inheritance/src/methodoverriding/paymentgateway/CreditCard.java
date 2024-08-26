package methodoverriding.paymentgateway;

public class CreditCard extends Payment{

    @Override
    void validateDetails() {
        System.out.println("Validating credit card payment");
    }

    @Override
    void detectFraud(double amount) {
        System.out.println("Performing credit card fraud detection...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}
