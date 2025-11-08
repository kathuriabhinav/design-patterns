package patterns.factory.simpleFactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("Customer 1 orders a Cheese Pizza:");
        store.orderPizza("cheese");

        System.out.println("\nCustomer 2 orders a Veg Pizza:");
        store.orderPizza("veg");
    }
}
