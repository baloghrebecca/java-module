package academy.everyonecodes.java.week8.additional.exercise1;

import java.util.List;

public class SmsParser {

    public Sms parseLine(String line) {
        List<String> splitLine = List.of(line.split(";"));
        return new Sms(splitLine.get(0), splitLine.get(1));
    }
}
