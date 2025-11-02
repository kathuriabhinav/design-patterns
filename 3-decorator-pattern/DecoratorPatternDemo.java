public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Simple espresso
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        // House Blend with Soy, Mocha, and Whip
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

        // Dark Roast double mocha with milk
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Milk(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
    }
}
