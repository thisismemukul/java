package methodoverriding.paymentgateway;

public class NetBanking extends Payment{

    @Override
    void validateDetails() {
        System.out.println("Validating net banking payment");
    }

    @Override
    void detectFraud(double amount) {
        System.out.println("Performing net banking fraud detection...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing net banking payment of ₹" + amount);
    }
}
