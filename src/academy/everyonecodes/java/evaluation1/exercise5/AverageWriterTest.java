package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.tools.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageWriterTest {

    AverageWriter averageWriter = new AverageWriter();
    FileReader fileReader = new FileReader();
    String fileToExpect = "src/academy/everyonecodes/java/evaluation1/files/averages_expected.txt";
    String fileToWrite = "src/academy/everyonecodes/java/evaluation1/files/averages.txt";
    String originalFile = "src/academy/everyonecodes/java/evaluation1/files/numbers.txt";

    @Test
    void reverseEqualsTheLinesExpectedFile() {
        List<String> expected = fileReader.read(fileToExpect);
        averageWriter.write(originalFile, fileToWrite);
        List<String> result = fileReader.read(fileToWrite);
        assertEquals(expected, result);
    }


    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/evaluation1/files/averages.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}