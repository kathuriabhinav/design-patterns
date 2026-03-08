package patterns.structural.adapter;

// Adaptee - another third-party class with different interface
public class Mp4Player {

    public void playMp4(String filename) {
        System.out.println("MP4 Player: Playing " + filename);
    }
}
