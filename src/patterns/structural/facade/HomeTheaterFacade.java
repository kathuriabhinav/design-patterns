package patterns.structural.facade;

// Facade - provides simple interface to complex subsystem
public class HomeTheaterFacade {

    private final Lights lights;
    private final TV tv;
    private final SoundSystem soundSystem;
    private final StreamingPlayer streamingPlayer;

    public HomeTheaterFacade(Lights lights, TV tv, SoundSystem soundSystem, StreamingPlayer streamingPlayer) {
        this.lights = lights;
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.streamingPlayer = streamingPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("\n--- Starting movie night ---");
        lights.dim(20);
        tv.on();
        tv.setInput("HDMI");
        soundSystem.on();
        soundSystem.setVolume(50);
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("\n--- Ending movie night ---");
        streamingPlayer.off();
        soundSystem.off();
        tv.off();
        lights.on();
    }
}
