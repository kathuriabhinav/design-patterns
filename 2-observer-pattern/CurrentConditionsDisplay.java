public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    @SuppressWarnings("unused")
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.printf("Current conditions: %.1fF degrees and %.1f%% humidity%n",
                temperature, humidity);
    }
}
