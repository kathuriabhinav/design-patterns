package patterns.factory.factoryMethod;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // factory method
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // subclasses decide what concrete class to instantiate
    protected abstract Pizza createPizza(String type);
}

class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese"))
            return new ChicagoStyleCheesePizza();
        if (type.equalsIgnoreCase("veg"))
            return new ChicagoStyleVegPizza();
        return null;
    }
}

class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese"))
            return new NYStyleCheesePizza();
        if (type.equalsIgnoreCase("veg"))
            return new NYStyleVegPizza();
        return null;
    }
}