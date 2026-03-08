package patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("NY Store Order:");
        Pizza p1 = nyStore.orderPizza("cheese");
        System.out.println("Got: " + p1.getName());

        System.out.println("\nChicago Store Order:");
        Pizza p2 = chicagoStore.orderPizza("cheese");
        System.out.println("Got: " + p2.getName());
    }
}
