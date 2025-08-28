package Assignment_1b;
import java.util.ArrayList;

public class Playlist {
    protected String name;
    protected ArrayList<Song> songs;

    // Initialize Variables
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Basic Methods
    void addSong(Song song){
        songs.add(song);
    }

    void removeSong(Song song){
        songs.remove(song);
    }

    void playAllSongs(){
        for(Song song : songs){
            System.out.println("Now Playing: " + song.getArtist() + " - " + song.getTitle() + " - " + song.getDuration());
        }
    }
}
