package patterns.creational.abstractfactory;

interface Dough {
}

interface Sauce {
}

interface Cheese {
}

class ThinCrustDough implements Dough {

    @Override
    public String toString() {
        return "Thin Crust Dough";
    }
}

class MarinaraSauce implements Sauce {

    @Override
    public String toString() {
        return "Marinara Sauce";
    }
}

class ReggianoCheese implements Cheese {

    @Override
    public String toString() {
        return "Reggiano Cheese";
    }
}

class ThickCrustDough implements Dough {

    @Override
    public String toString() {
        return "Thick Crust Dough";
    }
}

class PlumTomatoSauce implements Sauce {

    @Override
    public String toString() {
        return "Plum Tomato Sauce";
    }
}

class MozzarellaCheese implements Cheese {

    @Override
    public String toString() {
        return "Mozzarella Cheese";
    }
}
