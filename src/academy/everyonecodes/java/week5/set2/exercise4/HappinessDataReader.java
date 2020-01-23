package academy.everyonecodes.java.week5.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise6.Song;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {

    public Optional<List<HappinessRecord>> read() {
        HappinessDataParser happinessDataParser = new HappinessDataParser();
        String file = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";
        Path path = Path.of(file);
        List<String> records;
        try {
            records = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
        Optional<List<HappinessRecord>> oHappinessRecords = Optional.of(new ArrayList<>());
        for (String record : records) {
            Optional<HappinessRecord> oRecord = happinessDataParser.parse(record);
            if (oRecord.isPresent()) {
                oHappinessRecords.get().add(oRecord.get());
            }
        }
        return oHappinessRecords;

    }
}