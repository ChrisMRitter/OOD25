package Assignment_1c;

public class Song {
    private String artist;
    private String title;
    private double duration;
    private String mood;
    private String genre;

    // Initialize Variables
    public Song(String artist, String title, double duration, String mood, String genre) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
        this.mood = mood;
        this.genre = genre;
    }

    // Methods
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getMood() {
        return mood;
    }

    public String getGenre() {
        return genre;
    }
}
