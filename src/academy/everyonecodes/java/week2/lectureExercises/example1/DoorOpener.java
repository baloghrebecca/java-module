package academy.everyonecodes.java.week2.set1.exercise1;

import academy.everyonecodes.java.week2.lectureExercises.example1.Door;
import academy.everyonecodes.java.week2.lectureExercises.example1.Key;

public class DoorOpener {

    public static void open(Door door, Key key) {

        if (door.getKeyPhrase().equals(key.getKeyPhrase())) {
            System.out.println("I'm opening the door using " + key.getName() + "'s key.");
        } else {
            System.out.println("This is the wrong key!");
        }


    }


}
