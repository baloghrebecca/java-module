package academy.everyonecodes.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFileReader {

    public Stream<String> readLines(String contentRootPath) {
        Path path = Path.of(contentRootPath);
        try {
           Stream<String> lines = Files.lines(path);
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return (Stream<String>) new ArrayList<>();
        }
    }
}
