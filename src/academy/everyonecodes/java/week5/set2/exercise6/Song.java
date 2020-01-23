package academy.everyonecodes.java.week5.set2.exercise6;

public class Song {

    private String title;
    private int rank;
    private String songArtist;

    public Song(String title, int rank, String songArtist) {
        this.title = title;
        this.rank = rank;
        this.songArtist = songArtist;
    }

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public String getSongArtist() {
        return songArtist;
    }
}
