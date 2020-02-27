package academy.everyonecodes.java.es.stream;

import java.util.List;

public class Movies {

    private String name;
    private List<String> genres;
    private int time;
    private long revenue;

    public Movies(String name, List<String> genres, int time, long revenue) {
        this.name = name;
        this.genres = genres;
        this.time = time;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public List<String> getGenres() {
        return genres;
    }

    public int getTime() {
        return time;
    }

    public long getRevenue() {
        return revenue;
    }


}
