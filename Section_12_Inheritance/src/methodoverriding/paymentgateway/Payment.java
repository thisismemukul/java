package methodoverriding.paymentgateway;

abstract class Payment {
    void validateDetails() {
        System.out.println("Validating a generic payment");
    }
    void detectFraud(double amount) {
        System.out.println("Detecting Fraud of a generic payment of ₹" + amount);
    }
    void processPayment(double amount) {
        System.out.println("Processing a generic payment of ₹" + amount);
    }
    void logTransaction(double amount) {
        System.out.println("Processed a generic payment of ₹" + amount);
    }

    public final void executePayment(double amount) {
        validateDetails();
        detectFraud(amount);
        processPayment(amount);
        logTransaction(amount);
    }
}
