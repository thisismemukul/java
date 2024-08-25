package methodoverriding.paymentgateway;

public class NetBanking extends Payment{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing net banking payment of ₹" + amount);
    }
}
