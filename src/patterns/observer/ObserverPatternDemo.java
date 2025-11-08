package patterns.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        @SuppressWarnings("unused")
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        // Simulate new weather measurements
        System.out.println("First measurement:");
        weatherData.setMeasurements(80, 65, 30.4f);

        System.out.println("\nSecond measurement:");
        weatherData.setMeasurements(82, 70, 29.2f);

        System.out.println("\nThird measurement:");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
