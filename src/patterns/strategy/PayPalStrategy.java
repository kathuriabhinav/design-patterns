package patterns.strategy;

public class PayPalStrategy implements PaymentStrategy {
    private String email;
    @SuppressWarnings("unused")
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal");
        System.out.println("PayPal Email: " + email);
    }
}
