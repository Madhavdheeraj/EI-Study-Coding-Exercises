public class PaymentAdapter implements NewPaymentGateway {
    private LegacyPaymentGateway legacyPaymentGateway;

    public PaymentAdapter(LegacyPaymentGateway legacyPaymentGateway) {
        this.legacyPaymentGateway = legacyPaymentGateway;
    }

    @Override
    public void processPayment(String customer, double amount) {
        // Adapting the method to match the legacy gateway's signature
        legacyPaymentGateway.makePayment(customer, amount);
    }
}