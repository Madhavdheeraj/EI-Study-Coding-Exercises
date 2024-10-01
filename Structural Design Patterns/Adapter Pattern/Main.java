
// Main.java (Testing)
public class Main {
    public static void main(String[] args) {
        LegacyPaymentGateway legacyGateway = new LegacyPaymentGateway();
        NewPaymentGateway adapter = new PaymentAdapter(legacyGateway);

        PaymentProcessor processor = new PaymentProcessor(adapter);
        processor.pay("John Doe", 150.0);
    }
}
