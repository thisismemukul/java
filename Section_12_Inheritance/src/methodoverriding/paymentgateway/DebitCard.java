package methodoverriding.paymentgateway;

public class DebitCard extends Payment{

    @Override
    void validateDetails() {
        System.out.println("Validating debit card payment");
    }

    @Override
    void detectFraud(double amount) {
        System.out.println("Performing debit card fraud detection...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing debit card payment of ₹" + amount);
    }
}
