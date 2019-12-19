package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;

public class HikeDisplayer {

    public static void display(Hike hike) {
        List<Hiker> hikers = hike.getHikers();
        System.out.println("The hike is on the " + hike.getDate() + " and the participants are:");
        for (Hiker hiker : hikers) {
            String name = hiker.getName();
            System.out.println(name);
        }

    }

}
