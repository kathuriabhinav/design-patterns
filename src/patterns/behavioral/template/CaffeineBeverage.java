package patterns.behavioral.template;

abstract class CaffeineBeverage {

    // concrete flow of the algorithm
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    // Concrete Methods
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook Method
    protected boolean customerWantsCondiments() {
        return true;
    }
}

// Subclasses override the abstract methods to provide specific implementations
class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}

class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    // Override hook method.
    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
