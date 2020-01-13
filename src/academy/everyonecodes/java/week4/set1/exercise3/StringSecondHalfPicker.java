package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringSecondHalfPicker {

    public static String pick(List<String> names) {

        Random random = new Random();
        int size = names.size();
        int listHalfSize = names.size()/2;
        int secondHalf = names.size()-listHalfSize;
        int randomNumber = random.nextInt(secondHalf) + listHalfSize;
        String randomName = names.get(randomNumber);
        return randomName;
    }


}
