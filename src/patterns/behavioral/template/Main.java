package patterns.behavioral.template;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("Preparing tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee:");
        coffee.prepareRecipe();
    }
}
