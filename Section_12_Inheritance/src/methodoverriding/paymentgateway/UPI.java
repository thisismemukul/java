package methodoverriding.paymentgateway;

public class UPI extends Payment {

    @Override
    void validateDetails() {
        System.out.println("Validating UPI payment");
    }

    @Override
    void detectFraud(double amount) {
        System.out.println("Performing UPI fraud detection...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
