package patterns.factory.abstractFactory;

abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class CheesePizza extends Pizza {
    PizzaIngredientFactory factory;

    CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        System.out.println(" -> " + dough);
        System.out.println(" -> " + sauce);
        System.out.println(" -> " + cheese);
    }
}

class VegPizza extends Pizza {
    PizzaIngredientFactory factory;

    VegPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        System.out.println(" -> " + dough);
        System.out.println(" -> " + sauce);
        System.out.println(" -> " + cheese);
    }
}
