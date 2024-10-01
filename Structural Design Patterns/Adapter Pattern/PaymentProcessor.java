// PaymentProcessor.java (Client Class using the New Interface)
public class PaymentProcessor {
    private NewPaymentGateway paymentGateway;

    public PaymentProcessor(NewPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void pay(String customer, double amount) {
        paymentGateway.processPayment(customer, amount);
    }
}