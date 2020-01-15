package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {

    public List<Integer> parser(String numbers){
        List<Integer> numbersParsed = new ArrayList<>();
        String[] numbersList = numbers.split(";");
        for (String number : numbersList) {
            Integer textToInteger = Integer.valueOf(number);
            numbersParsed.add(textToInteger);
        }

        return numbersParsed;

    }

}
