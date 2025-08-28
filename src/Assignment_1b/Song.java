package Assignment_1b;

public class Song {
    private String artist;
    private String title;
    private double duration;

    // Initializing variables
    public Song(String artist, String title, double duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    // Basic Methods
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}
