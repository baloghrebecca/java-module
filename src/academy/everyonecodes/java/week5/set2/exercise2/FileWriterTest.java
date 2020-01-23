package academy.everyonecodes.java.week5.set2.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


class FileWriterTest {

    FileWriter fileWriter = new FileWriter();
    FileReader fileReader = new FileReader();

    @Test
    void writerWithSeveralStringsInTheList() {
        String file = "src/academy/everyonecodes/java/week5/set2/files/newtextfile.txt";
        List<String> names = List.of("Andrea", "Agata", "Rebecca");
        fileWriter.write(file, names);
        List<String> result = fileReader.read(file);
        Assertions.assertEquals(names, result);
    }


    @Test
    void writerWithNoStringsInList() {
        String file = "src/academy/everyonecodes/java/week5/set2/files/newtextfile.txt";
        List<String> names = List.of();
        fileWriter.write(file, names);
        List<String> result = fileReader.read(file);
        Assertions.assertEquals(names, result);
    }

    @Test
    void writerWithSeveralStringsInTheListAppended() {
        String file = "src/academy/everyonecodes/java/week5/set2/files/newtextfile.txt";
        List<String> names = List.of("Alexander", "David");
        List<String> expected = List.of("Alexander", "David");
        fileWriter.append(file, names);
        List<String> result = fileReader.read(file);
        Assertions.assertEquals(expected, result);
    }



    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/newtextfile.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}