package academy.everyonecodes.java.week8.additional.exercise1;

import academy.everyonecodes.java.evaluation1.tools.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {

    private String file = "src/academy/everyonecodes/java/week8/additional/files/sms.csv";
    private FileReader fileReader = new FileReader();
    private SmsParser parser = new SmsParser();

    public List<Sms> reader() {
        return fileReader.read(file).stream()
                .map(e -> parser.parseLine(file))
                .collect(Collectors.toList());

    }
}
