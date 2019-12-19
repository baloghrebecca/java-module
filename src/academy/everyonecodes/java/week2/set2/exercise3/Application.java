package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        HikerGatherer gatherer = new HikerGatherer();
        List<Hiker> hikers = gatherer.gather();

        Hike mondayHike = new Hike("06.10.2019", hikers);
        HikeDisplayer display = new HikeDisplayer();

        display.display(mondayHike);


    }

}
