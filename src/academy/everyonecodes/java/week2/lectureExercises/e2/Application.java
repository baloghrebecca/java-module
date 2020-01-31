package academy.everyonecodes.java.week2.lectureExercises.e2;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        TvShows killingEve = new TvShows("Killing Eve", 14);
        TvShows glee = new TvShows("Glee", 23);
        TvShows mondayShow = new TvShows("The Morning Show", 12);

        List<TvShows> tvShowsList = List.of(killingEve, glee, mondayShow);
        for (TvShows show : tvShowsList) {
            System.out.println("The tv show " + show.getName() + " has " + show.getNumberOfEpisodes() + " episodes.");
        }

    }


}
