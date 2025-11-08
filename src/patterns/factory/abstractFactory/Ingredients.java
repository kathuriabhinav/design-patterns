package patterns.factory.abstractFactory;

// Ingredient interfaces
interface Dough {
    String toString();
}

interface Sauce {
    String toString();
}

interface Cheese {
    String toString();
}

// NY Ingredients
class ThinCrustDough implements Dough {
    public String toString() {
        return "Thin Crust Dough";
    }
}

class MarinaraSauce implements Sauce {
    public String toString() {
        return "Marinara Sauce";
    }
}

class ReggianoCheese implements Cheese {
    public String toString() {
        return "Reggiano Cheese";
    }
}

// Chicago Ingredients
class ThickCrustDough implements Dough {
    public String toString() {
        return "Thick Crust Dough";
    }
}

class PlumTomatoSauce implements Sauce {
    public String toString() {
        return "Plum Tomato Sauce";
    }
}

class MozzarellaCheese implements Cheese {
    public String toString() {
        return "Mozzarella Cheese";
    }
}
