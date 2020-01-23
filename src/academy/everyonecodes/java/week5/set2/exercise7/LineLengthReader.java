package academy.everyonecodes.java.week5.set2.exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LineLengthReader {

    public List<Integer> read() {
        String file = "src/academy/everyonecodes/java/week5/set2/files/strings.txt";
        Path path = Path.of(file);
        List<String> lines;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        List<Integer> lineLengths = new ArrayList<>();
        for (String line : lines) {
            lineLengths.add(line.length());
        }

        return lineLengths;

    }

}
