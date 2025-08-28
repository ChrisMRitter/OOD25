package Assignment_1b;
import java.util.ArrayList;

// Sources: https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html
// https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html

public class User {
    private String username;
    private ArrayList<Playlist> playlists;

    // Initializing Variables
    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    // Method to make a playlist
    public Playlist createPlaylist(String name, String type){
        Playlist newPlaylist = null;
        switch (type.toLowerCase()){
            case "pop":
                newPlaylist = new PopPlaylist(name);
                break;
            case "rock":
                newPlaylist = new RockPlaylist(name);
                break;
            case "jazz":
                newPlaylist = new JazzPlaylist(name);
                break;
            default:
                newPlaylist = null;
                break;
        }
        if (newPlaylist != null) {
            playlists.add(newPlaylist);
            System.out.println("Playlist " + name + " created");
        }
        return newPlaylist;
    }

    // Method to delete a playlist
    public void deletePlaylist(Playlist playlist){
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).equals(playlist)) {
                playlists.remove(i);
                System.out.println("Deleted Playlist: " + playlist.name);
                break;
            }
        }
    }

    // Method to add a song to a playlist
    public void addSongToPlaylist(Playlist playlist, Song song){
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).equals(playlist)) {
                playlists.get(i).addSong(song);
                System.out.println("Added Song to Playlist: " + playlist.name);
                break;
            }
        }
    }

    // Method to remove a song to a playlist
    public void removeSongFromPlaylist(Playlist playlist, Song song){
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).equals(playlist)) {
                playlists.get(i).removeSong(song);
                System.out.println("Removed song " + song.getTitle() + " from playlist " + playlist.name);
                break;
            }
        }
    }
}
