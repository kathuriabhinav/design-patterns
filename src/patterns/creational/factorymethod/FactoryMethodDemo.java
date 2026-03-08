package patterns.creational.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("NY Store - Cheese Pizza:");
        Pizza p1 = nyStore.orderPizza("cheese");
        System.out.println("Got: " + p1.getName());

        System.out.println("\nChicago Store - Veg Pizza:");
        Pizza p2 = chicagoStore.orderPizza("veg");
        System.out.println("Got: " + p2.getName());
    }
}
