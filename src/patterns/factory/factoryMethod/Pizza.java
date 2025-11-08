package patterns.factory.factoryMethod;

public abstract class Pizza {
    String name;

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

class ChicagoStyleVegPizza extends Pizza {
    public ChicagoStyleVegPizza() {
        name = "Chicago Style Veg Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name + " into square slices");
    }
}

class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name + " into square slices");
    }
}

class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
    }
}

class NYStyleVegPizza extends Pizza {
    public NYStyleVegPizza() {
        name = "NY Style Veg Pizza";
    }
}
