package methodoverriding.paymentgateway;

public class PaymentGateway {
    public static void main(String[] args) {
        Payment payment;

        payment= new UPI();
        payment.processPayment(23);

        payment= new CreditCard();
        payment.validateDetails();
        payment.processPayment(512);

        payment = new DebitCard();
        payment.processPayment(18.2);

        payment =  new NetBanking();
        payment.processPayment(12000.54);

    }
}
