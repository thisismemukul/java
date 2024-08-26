package methodoverriding.paymentgateway;

public class PaymentGateway {
    public static void main(String[] args) {
        Payment payment;

        payment= new UPI();
        payment.executePayment(23);

        payment= new CreditCard();
        payment.executePayment(512);

        payment = new DebitCard();
        payment.executePayment(18.2);

        payment =  new NetBanking();
        payment.executePayment(12000.54);

    }
}
