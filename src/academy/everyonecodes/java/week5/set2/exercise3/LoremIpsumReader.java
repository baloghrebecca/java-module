package academy.everyonecodes.java.week5.set2.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LoremIpsumReader {

    public List<String> read() {
        String file = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";
        Path path = Path.of(file);
        try {
           List<String> lines = Files.readAllLines(path);
           return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

}
