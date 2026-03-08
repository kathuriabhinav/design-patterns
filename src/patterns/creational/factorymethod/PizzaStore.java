package patterns.creational.factorymethod;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Factory method - subclasses decide what to create
    protected abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" ->
                new NYCheesePizza();
            case "veg" ->
                new NYVegPizza();
            default ->
                null;
        };
    }
}

class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" ->
                new ChicagoCheesePizza();
            case "veg" ->
                new ChicagoVegPizza();
            default ->
                null;
        };
    }
}
