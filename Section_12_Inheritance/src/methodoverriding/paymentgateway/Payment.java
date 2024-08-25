package methodoverriding.paymentgateway;

abstract class Payment {
    abstract void validateDetails();
    abstract void detectFraud(double amount);
    abstract void processPayment(double amount);
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
