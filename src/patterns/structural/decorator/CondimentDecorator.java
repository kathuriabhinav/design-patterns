package patterns.structural.decorator;

public abstract class CondimentDecorator extends Beverage {

    protected final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
