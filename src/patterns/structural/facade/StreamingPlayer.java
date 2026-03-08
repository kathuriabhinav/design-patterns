package patterns.structural.facade;

// Subsystem class
public class StreamingPlayer {

    public void on() {
        System.out.println("Streaming player on");
    }

    public void off() {
        System.out.println("Streaming player off");
    }

    public void play(String movie) {
        System.out.println("Playing: " + movie);
    }
}
