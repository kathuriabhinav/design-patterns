package patterns.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherDisplay display = new WeatherDisplay(station);

        station.setMeasurements(80, 65, 30.4f);
        station.setMeasurements(82, 70, 29.2f);

        station.removeObserver(display);
        station.setMeasurements(78, 90, 29.2f);
    }
}
