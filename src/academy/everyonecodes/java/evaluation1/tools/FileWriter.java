package academy.everyonecodes.java.evaluation1.tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {

    public void write(String file, List<String> lines) {
        Path path = Path.of(file);
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
