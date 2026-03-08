package patterns.behavioral.observer;

public class WeatherDisplay implements Observer {

    private float temperature;
    private float humidity;

    @SuppressWarnings("LeakingThisInConstructor")
    public WeatherDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.printf("Current: %.1f°F, %.1f%% humidity%n", temperature, humidity);
    }
}
