package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;

public class Hike {

    private String date;
    private List<Hiker> hikers;

    public Hike(String date, List<Hiker> hikers) {
        this.date = date;
        this.hikers = hikers;
    }

    public String getDate() {
        return date;
    }

    public List<Hiker> getHikers() {
        return hikers;
    }

}
