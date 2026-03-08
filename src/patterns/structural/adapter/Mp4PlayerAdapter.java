package patterns.structural.adapter;

// Adapter - makes Mp4Player compatible with MediaPlayer interface
public class Mp4PlayerAdapter implements MediaPlayer {

    private final Mp4Player mp4Player;

    public Mp4PlayerAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String filename) {
        mp4Player.playMp4(filename);
    }
}
