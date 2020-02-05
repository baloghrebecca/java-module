package academy.everyonecodes.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileLineAppender {

    public void append(String file, String line) {
        Path path = Path.of(file);
        try {
            Files.write(path, List.of(line), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            //The file writer needs a list to write (a writeString would just write it all in one line)
            // so we create a list with one element and then it writes every new element in a new line
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
