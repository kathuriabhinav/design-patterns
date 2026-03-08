package patterns.creational.abstractfactory;

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
        IngredientFactory factory = new NYIngredientFactory();
        CheesePizza pizza = new CheesePizza(factory);
        pizza.setName("NY Style Cheese Pizza");
        return pizza;
    }
}

class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        IngredientFactory factory = new ChicagoIngredientFactory();
        CheesePizza pizza = new CheesePizza(factory);
        pizza.setName("Chicago Style Cheese Pizza");
        return pizza;
    }
}
