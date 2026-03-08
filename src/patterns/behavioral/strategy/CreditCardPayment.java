package patterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card ending in "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}
