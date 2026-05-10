package patterns.structural.facade;

/**
 * Facade Pattern: Provides a simplified interface to a complex subsystem.
 *
 * Use when you want to provide a simple interface to a complex set of classes.
 */
public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Lights(),
                new TV(),
                new SoundSystem(),
                new StreamingPlayer()
        );

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
