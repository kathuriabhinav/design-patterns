package patterns.structural.adapter;

/**
 * Adapter Pattern: Converts one interface to another that clients expect.
 *
 * Use when you need to use an existing class but its interface doesn't match
 * yours.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        MediaPlayer vlcAdapter = new VlcPlayerAdapter(new VlcPlayer());
        MediaPlayer mp4Adapter = new Mp4PlayerAdapter(new Mp4Player());

        vlcAdapter.play("movie.vlc");
        mp4Adapter.play("song.mp4");
    }
}
