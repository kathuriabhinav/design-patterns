public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String name;
    @SuppressWarnings("unused")
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String cardNumber, String name, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card");
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Name: " + name);
        System.out.println("Expiry Date: " + expiryDate);
    }

    private String maskCardNumber(String cardNumber) {
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}
