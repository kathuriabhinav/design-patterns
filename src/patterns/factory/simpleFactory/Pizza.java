package patterns.factory.simpleFactory;

public interface Pizza {
    void prepare();

    void bake();

    void cut();

    void box();
}

class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza");
    }
}

class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veg Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veg Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veg Pizza");
    }
}
