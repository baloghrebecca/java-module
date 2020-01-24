package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegersParser {

    public List<Integer> parse(String word) {
        List<String> lines = List.of(word.split(";"));
        List<Integer> linesAsInteger = new ArrayList<>();
        for (String line : lines) {
            Integer lineAsIntConverter = Integer.valueOf(line);
            linesAsInteger.add(lineAsIntConverter);
        }
        return linesAsInteger;
    }

}
