package Assignment_1c;

import java.util.ArrayList;

public class PopPlaylist implements Playlist {
    protected String name;
    protected ArrayList<Song> songs;

    // Initialize variables
    public PopPlaylist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Methods
    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }

    public void playAllSongs(){
        for(Song song : songs){
            System.out.println("Now Playing: " + song.getArtist() + " - " + song.getTitle() + " - " + song.getDuration());
        }
    }

    public String getName() {
        return name;
    }
}
