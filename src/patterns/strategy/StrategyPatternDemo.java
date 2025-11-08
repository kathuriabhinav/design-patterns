package patterns.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Create the payment processor
        PaymentProcessor processor = new PaymentProcessor();

        // Process payment using Credit Card
        System.out.println("=== Processing payment with Credit Card ===");
        PaymentStrategy creditCardStrategy = new CreditCardStrategy(
                "1234567890123456", "John Doe", "123", "12/25");
        processor.setPaymentStrategy(creditCardStrategy);
        processor.processPayment(100.00);

        // Process payment using PayPal
        System.out.println("\n=== Processing payment with PayPal ===");
        PaymentStrategy payPalStrategy = new PayPalStrategy(
                "john.doe@example.com", "password123");
        processor.setPaymentStrategy(payPalStrategy);
        processor.processPayment(50.00);
    }
}
