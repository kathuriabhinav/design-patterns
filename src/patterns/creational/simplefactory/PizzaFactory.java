package patterns.creational.simplefactory;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" ->
                new CheesePizza();
            case "veg" ->
                new VegPizza();
            default ->
                throw new IllegalArgumentException("Unknown pizza: " + type);
        };
    }
}
