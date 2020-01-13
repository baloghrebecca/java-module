package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {

    public static String pick(List<String> names) {
        Random random = new Random();

        int sizeOfListHalf = names.size() / 2;
        int randomNumber = random.nextInt(sizeOfListHalf);

        String pickRandom = names.get(randomNumber);
        return pickRandom;

    }



}
