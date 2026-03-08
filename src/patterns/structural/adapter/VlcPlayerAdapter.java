package patterns.structural.adapter;

// Adapter - makes VlcPlayer compatible with MediaPlayer interface
public class VlcPlayerAdapter implements MediaPlayer {

    private final VlcPlayer vlcPlayer;

    public VlcPlayerAdapter(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String filename) {
        vlcPlayer.playVlcFile(filename);
    }
}
