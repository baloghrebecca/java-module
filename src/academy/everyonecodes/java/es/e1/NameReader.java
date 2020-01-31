package academy.everyonecodes.java.es.e1;

import academy.everyonecodes.java.evaluation1.tools.FileReader;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class NameReader {

    private String file = "src/academy/everyonecodes/java/es/e1/files/name.txt";
    private FileReader fileReader = new FileReader();

    public Optional<String> read() {
        List<String> lines = fileReader.read(file);
        if (lines.isEmpty()) {
            return Optional.empty();
        }
        String name = lines.get(0);
        return Optional.of(name);
    }
}
