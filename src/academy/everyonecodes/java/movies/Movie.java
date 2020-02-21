package academy.everyonecodes.java.movies;

public class Movie {

    private String name;
    private String genre;
    private Boolean isWatched;

    public Movie(String name, String genre, Boolean isWatched) {
        this.name = name;
        this.genre = genre;
        this.isWatched = isWatched;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Boolean getWatched() {
        return isWatched;
    }
}
