package patterns.structural.adapter;

// Adaptee - third-party class with incompatible interface
public class VlcPlayer {

    public void playVlcFile(String filename) {
        System.out.println("VLC: Playing " + filename);
    }
}
