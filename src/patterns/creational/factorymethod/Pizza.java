package patterns.creational.factorymethod;

public abstract class Pizza {

    protected String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}

class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NY Cheese Pizza";
    }
}

class NYVegPizza extends Pizza {

    public NYVegPizza() {
        name = "NY Veg Pizza";
    }
}

class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago Cheese Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name + " into squares");
    }
}

class ChicagoVegPizza extends Pizza {

    public ChicagoVegPizza() {
        name = "Chicago Veg Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name + " into squares");
    }
}
