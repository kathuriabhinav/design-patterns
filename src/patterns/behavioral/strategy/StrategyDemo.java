package patterns.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        cart.checkout(100.00);

        cart.setPaymentStrategy(new PayPalPayment("user@email.com"));
        cart.checkout(50.00);
    }
}
