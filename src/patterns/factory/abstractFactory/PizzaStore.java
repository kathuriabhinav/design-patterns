package patterns.factory.abstractFactory;

abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (type.equalsIgnoreCase("veg")) {
            pizza = new VegPizza(factory);
            pizza.setName("NY Style Veg Pizza");
        }
        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equalsIgnoreCase("veg")) {
            pizza = new VegPizza(factory);
            pizza.setName("Chicago Style Veg Pizza");
        }
        return pizza;
    }
}
