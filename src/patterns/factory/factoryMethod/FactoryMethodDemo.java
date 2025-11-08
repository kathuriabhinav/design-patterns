package patterns.factory.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("Customer orders a Cheese Pizza from NY store:");
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Delivered: " + pizza1.getName());

        System.out.println("\nCustomer orders a Veg Pizza from Chicago store:");
        Pizza pizza2 = chicagoStore.orderPizza("veg");
        System.out.println("Delivered: " + pizza2.getName());
    }
}
