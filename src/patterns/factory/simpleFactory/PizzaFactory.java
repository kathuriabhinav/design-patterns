package patterns.factory.simpleFactory;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("veg")) {
            return new VegPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
        // Simple factory - Every new product forces a change to the shared logic (core)
        // This violates - close the framework to modification but open it for extension
        // Factory Method moves the modification point to extension (subclass), not core
    }
}
