package Assignment_1b;

public class Main {
    public static void main(String[] args) {
        User user = new User("NotChris");

        // Base Playlists
        Playlist playlist1 = user.createPlaylist("MJ's Greatest Hits","pop");
        Playlist playlist2 = user.createPlaylist("70's Rock","rock");
        Playlist playlist3 = user.createPlaylist("Trumpets n' Stuff","jazz");

        // Base Songs
        Song song1 = new Song("Michael Jackson","Smooth Criminal",4.17);
        Song song2 = new Song("Deep Purple","Smoke on the Water",5.42);
        Song song3 = new Song("Louis Armstrong","What a Wonderful World",2.19);
        Song song4 = new Song("Michael Jackson","Billie Jean",4.53);

        // Adding songs to playlists
        System.out.println();
        user.addSongToPlaylist(playlist1,song1);
        user.addSongToPlaylist(playlist1,song4);
        user.addSongToPlaylist(playlist2,song2);
        user.addSongToPlaylist(playlist3,song3);

        // Playing song tests
        System.out.println();
        playlist1.playAllSongs();
        playlist2.playAllSongs();
        playlist3.playAllSongs();

        // Removing song tests
        System.out.println();
        user.removeSongFromPlaylist(playlist1,song4);
        playlist1.playAllSongs();

        // Deleting Playlist test
        System.out.println();
        user.deletePlaylist(playlist3);
    }
}
