
// Main.java (Testing)
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.processPayment(250.0);

        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.processPayment(150.0);

        paymentContext.setPaymentStrategy(new CryptoPayment("0x123456789abcdef"));
        paymentContext.processPayment(300.0);
    }
}
