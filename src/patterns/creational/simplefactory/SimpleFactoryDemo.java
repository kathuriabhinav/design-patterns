package patterns.creational.simplefactory;

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new PizzaFactory());

        System.out.println("Order 1: Cheese Pizza");
        store.orderPizza("cheese");

        System.out.println("\nOrder 2: Veg Pizza");
        store.orderPizza("veg");
    }
}
