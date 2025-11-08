package patterns.factory.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("Order from NY Store:");
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Delivered: " + pizza1.getName());

        System.out.println("\nOrder from Chicago Store:");
        Pizza pizza2 = chicagoStore.orderPizza("veg");
        System.out.println("Delivered: " + pizza2.getName());
    }
}
