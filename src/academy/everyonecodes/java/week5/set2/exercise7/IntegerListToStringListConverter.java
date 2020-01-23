package academy.everyonecodes.java.week5.set2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringListConverter {

    public List<String> convert() {
        LineLengthReader lineLengthReader = new LineLengthReader();
        List<Integer> linesLengths = lineLengthReader.read();
        if (linesLengths.size() == 0) {
            return new ArrayList<>();
        }
        List<String> numbersIntoString = new ArrayList<>();
        for (Integer line : linesLengths) {
            numbersIntoString.add(line.toString());
        }
        return numbersIntoString;
    }

}
