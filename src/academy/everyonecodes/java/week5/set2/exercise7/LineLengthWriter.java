package academy.everyonecodes.java.week5.set2.exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineLengthWriter {

    public void writer() {
        String newFile = "src/academy/everyonecodes/java/week5/set2/files/stringslengths.txt";
        Path path = Path.of(newFile);
        IntegerListToStringListConverter integerListToStringListConverter = new IntegerListToStringListConverter();
        List<String> numbers = integerListToStringListConverter.convert();
        try {
            Files.write(path, numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
