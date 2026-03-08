package patterns.creational.abstractfactory;

abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;

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

    private final IngredientFactory factory;

    CheesePizza(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        System.out.println("  " + dough + ", " + sauce + ", " + cheese);
    }
}
