package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.stream.Collectors;

public class HappinessDataReader {

    StreamFileReader streamFileReader = new StreamFileReader();
    HappinessDataParser happinessDataParser = new HappinessDataParser();

    public List<HappinessRecord> read() {
        String file = "src/academy/everyonecodes/java/week7/set2/files/world-happiness-2017.csv";
        List<HappinessRecord> happinessRecords = streamFileReader.readLines(file)
                .skip(1)
                .map(line -> happinessDataParser.parse(line))
                .filter(oHappinessRecord -> oHappinessRecord.isPresent())
                .map(oHappinessRecord -> oHappinessRecord.get())
                .collect(Collectors.toList());
        return happinessRecords;
    }

}
