package Assignment_1c;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("NotChris");

        // Base Playlists
        Playlist playlist1 = user.createPlaylist("MJ's Greatest Hits","pop");
        Playlist playlist2 = user.createPlaylist("70's Rock","rock");
        Playlist playlist3 = user.createPlaylist("Trumpets n' Stuff","jazz");

        // Base Songs
        Song song1 = new Song("Michael Jackson","Smooth Criminal",4.17,"idk","pop");
        Song song2 = new Song("Deep Purple","Smoke on the Water",5.42,"idk","rock");
        Song song3 = new Song("Louis Armstrong","What a Wonderful World",2.19,"happy","jazz");
        Song song4 = new Song("Michael Jackson","Billie Jean",4.53,"idk","pop");

        // Happy Songs (I made them all Pop to make things easy)
        Song song5 = new Song("Billie Smileish","Good Guy",5.25,"happy","pop");
        Song song6 = new Song("Lady GladGlad","Hoper Face",1.22,"happy","pop");
        Song song7 = new Song("Taylor Skip","Good Blood",4.23,"happy","pop");
        Song song8 = new Song("Ariana Good-day","thank u, fr",3.57,"happy","pop");
        Song song9 = new Song("Sir Skips-A-Lot","Baby Got Snacks",2.23,"happy","pop");

        // Sad Songs (I made them all Rock to make things easy)
        Song song10 = new Song("Post Alone","Blame",5.53,"sad","rock");
        Song song11 = new Song("Rick Loss","Ima Loss",7.23,"sad","rock");
        Song song12 = new Song("Panic! at the Disco","House of Memories",4.25,"sad","rock");
        Song song13 = new Song("Beasaddoobee","The Imperfect Pair",6.22,"sad","rock");
        Song song14 = new Song("Metro Gloomin","Supervillain",4.33,"sad","rock");

        // Idk Songs (I made them all Jazz to make things easy)
        Song song15 = new Song("Squizlix","Intergalactic Noises Vol.5",14234.15,"idk","jazz");
        Song song16 = new Song("An Actual Whale","Ocean",11.51,"idk","jazz");
        Song song17 = new Song("Slim Jim","Slim Jim Commercial #42",2.52,"idk","jazz");
        Song song18 = new Song("Noises McGee","White Noise (10 hrs)",600.00,"idk","jazz");
        Song song19 = new Song("Imagine Dragons","Thunder",3.07,"idk","jazz");

        // Adding songs
        System.out.println();
        user.addSongToPlaylist(playlist1,song1);
        user.addSongToPlaylist(playlist1,song4);
        user.addSongToPlaylist(playlist2,song2);
        user.addSongToPlaylist(playlist3,song3);

        // Playings songs
        System.out.println();
        playlist1.playAllSongs();
        playlist2.playAllSongs();
        playlist3.playAllSongs();

        // Removing Songs
        System.out.println();
        user.removeSongFromPlaylist(playlist1,song4);
        playlist1.playAllSongs();

        // Deleting a playlist
        System.out.println();
        user.deletePlaylist(playlist3);

        Scanner scanner = new Scanner(System.in);

        // Hard-coded mess for reccomendations. Wasn't sure how to streamline this but here it is.
        System.out.println();
        System.out.print("Would you like some song reccomendations? Enter 1 for yes or 2 for no: ");
        int choice1 = scanner.nextInt();
        if (choice1 == 1) {
            scanner.nextLine();
            System.out.print("Great! Now would you like to see all available songs, or filter by genre or mood? Enter 1 for all songs, 2 for genre or 3 for mood: ");
            int choice2 = scanner.nextInt();
            if (choice2 == 1) {
                System.out.println();
                System.out.println(song1.getArtist() + " - " + song1.getTitle() + " (" + song1.getDuration() + " mins)");
                System.out.println(song2.getArtist() + " - " + song2.getTitle() + " (" + song2.getDuration() + " mins)");
                System.out.println(song3.getArtist() + " - " + song3.getTitle() + " (" + song3.getDuration() + " mins)");
                System.out.println(song4.getArtist() + " - " + song4.getTitle() + " (" + song4.getDuration() + " mins)");
                System.out.println(song5.getArtist() + " - " + song5.getTitle() + " (" + song5.getDuration() + " mins)");
                System.out.println(song6.getArtist() + " - " + song6.getTitle() + " (" + song6.getDuration() + " mins)");
                System.out.println(song7.getArtist() + " - " + song7.getTitle() + " (" + song7.getDuration() + " mins)");
                System.out.println(song8.getArtist() + " - " + song8.getTitle() + " (" + song8.getDuration() + " mins)");
                System.out.println(song9.getArtist() + " - " + song9.getTitle() + " (" + song9.getDuration() + " mins)");
                System.out.println(song10.getArtist() + " - " + song10.getTitle() + " (" + song10.getDuration() + " mins)");
                System.out.println(song11.getArtist() + " - " + song11.getTitle() + " (" + song11.getDuration() + " mins)");
                System.out.println(song12.getArtist() + " - " + song12.getTitle() + " (" + song12.getDuration() + " mins)");
                System.out.println(song13.getArtist() + " - " + song13.getTitle() + " (" + song13.getDuration() + " mins)");
                System.out.println(song14.getArtist() + " - " + song14.getTitle() + " (" + song14.getDuration() + " mins)");
                System.out.println(song15.getArtist() + " - " + song15.getTitle() + " (" + song15.getDuration() + " mins)");
                System.out.println(song16.getArtist() + " - " + song16.getTitle() + " (" + song16.getDuration() + " mins)");
                System.out.println(song17.getArtist() + " - " + song17.getTitle() + " (" + song17.getDuration() + " mins)");
                System.out.println(song18.getArtist() + " - " + song18.getTitle() + " (" + song18.getDuration() + " mins)");
                System.out.println(song19.getArtist() + " - " + song19.getTitle() + " (" + song19.getDuration() + " mins)");
            } else if (choice2 == 2) {
                scanner.nextLine();
                System.out.println();
                System.out.print("Which genre would you like to see? Enter 1 for Pop, 2 for Rock, or 3 for Jazz: ");
                int choice3 = scanner.nextInt();
                switch (choice3) {
                    case 1:
                        System.out.println();
                        System.out.println(song1.getArtist() + " - " + song1.getTitle() + " (" + song1.getDuration() + " mins)");
                        System.out.println(song4.getArtist() + " - " + song4.getTitle() + " (" + song4.getDuration() + " mins)");
                        System.out.println(song5.getArtist() + " - " + song5.getTitle() + " (" + song5.getDuration() + " mins)");
                        System.out.println(song6.getArtist() + " - " + song6.getTitle() + " (" + song6.getDuration() + " mins)");
                        System.out.println(song7.getArtist() + " - " + song7.getTitle() + " (" + song7.getDuration() + " mins)");
                        System.out.println(song8.getArtist() + " - " + song8.getTitle() + " (" + song8.getDuration() + " mins)");
                        System.out.println(song9.getArtist() + " - " + song9.getTitle() + " (" + song9.getDuration() + " mins)");
                        break;
                        case 2:
                            System.out.println();
                            System.out.println(song2.getArtist() + " - " + song2.getTitle() + " (" + song2.getDuration() + " mins)");
                            System.out.println(song10.getArtist() + " - " + song10.getTitle() + " (" + song10.getDuration() + " mins)");
                            System.out.println(song11.getArtist() + " - " + song11.getTitle() + " (" + song11.getDuration() + " mins)");
                            System.out.println(song12.getArtist() + " - " + song12.getTitle() + " (" + song12.getDuration() + " mins)");
                            System.out.println(song13.getArtist() + " - " + song13.getTitle() + " (" + song13.getDuration() + " mins)");
                            System.out.println(song14.getArtist() + " - " + song14.getTitle() + " (" + song14.getDuration() + " mins)");
                            break;
                            case 3:
                                System.out.println();
                                System.out.println(song3.getArtist() + " - " + song3.getTitle() + " (" + song3.getDuration() + " mins)");
                                System.out.println(song15.getArtist() + " - " + song15.getTitle() + " (" + song15.getDuration() + " mins)");
                                System.out.println(song16.getArtist() + " - " + song16.getTitle() + " (" + song16.getDuration() + " mins)");
                                System.out.println(song17.getArtist() + " - " + song17.getTitle() + " (" + song17.getDuration() + " mins)");
                                System.out.println(song18.getArtist() + " - " + song18.getTitle() + " (" + song18.getDuration() + " mins)");
                                System.out.println(song19.getArtist() + " - " + song19.getTitle() + " (" + song19.getDuration() + " mins)");
                                break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                }
            } else if (choice2 == 3) {
                scanner.nextLine();
                System.out.println();
                System.out.print("Which mood would you like to see? Enter 1 for happy, 2 for sad, or 3 for idk: ");
                int choice4 = scanner.nextInt();
                switch (choice4) {
                    case 1:
                        System.out.println();
                        System.out.println(song3.getArtist() + " - " + song3.getTitle() + " (" + song3.getDuration() + " mins)");
                        System.out.println(song5.getArtist() + " - " + song5.getTitle() + " (" + song5.getDuration() + " mins)");
                        System.out.println(song6.getArtist() + " - " + song6.getTitle() + " (" + song6.getDuration() + " mins)");
                        System.out.println(song7.getArtist() + " - " + song7.getTitle() + " (" + song7.getDuration() + " mins)");
                        System.out.println(song8.getArtist() + " - " + song8.getTitle() + " (" + song8.getDuration() + " mins)");
                        System.out.println(song9.getArtist() + " - " + song9.getTitle() + " (" + song9.getDuration() + " mins)");
                        break;
                        case 2:
                            System.out.println();
                            System.out.println(song10.getArtist() + " - " + song10.getTitle() + " (" + song10.getDuration() + " mins)");
                            System.out.println(song11.getArtist() + " - " + song11.getTitle() + " (" + song11.getDuration() + " mins)");
                            System.out.println(song12.getArtist() + " - " + song12.getTitle() + " (" + song12.getDuration() + " mins)");
                            System.out.println(song13.getArtist() + " - " + song13.getTitle() + " (" + song13.getDuration() + " mins)");
                            System.out.println(song14.getArtist() + " - " + song14.getTitle() + " (" + song14.getDuration() + " mins)");
                            break;
                            case 3:
                                System.out.println();
                                System.out.println(song1.getArtist() + " - " + song1.getTitle() + " (" + song1.getDuration() + " mins)");
                                System.out.println(song2.getArtist() + " - " + song2.getTitle() + " (" + song2.getDuration() + " mins)");
                                System.out.println(song4.getArtist() + " - " + song4.getTitle() + " (" + song4.getDuration() + " mins)");
                                System.out.println(song15.getArtist() + " - " + song15.getTitle() + " (" + song15.getDuration() + " mins)");
                                System.out.println(song16.getArtist() + " - " + song16.getTitle() + " (" + song16.getDuration() + " mins)");
                                System.out.println(song17.getArtist() + " - " + song17.getTitle() + " (" + song17.getDuration() + " mins)");
                                System.out.println(song18.getArtist() + " - " + song18.getTitle() + " (" + song18.getDuration() + " mins)");
                                System.out.println(song19.getArtist() + " - " + song19.getTitle() + " (" + song19.getDuration() + " mins)");
                                break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                }
            }
        } else if (choice1 == 2) {
            System.out.println("Understandable, have a nice day.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
