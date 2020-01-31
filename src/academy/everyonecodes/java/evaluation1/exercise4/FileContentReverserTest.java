package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.tools.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileContentReverserTest {

    FileContentReverser fileContentReverser = new FileContentReverser();
    FileReader fileReader = new FileReader();
    String fileToExpect = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed_expected.txt";
    String fileToWrite = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed.txt";
    String originalFile = "src/academy/everyonecodes/java/evaluation1/files/lines.txt";

    @Test
    void reverseEqualsTheLinesExpectedFile() {
        List<String> expected = fileReader.read(fileToExpect);
        fileContentReverser.reverse(originalFile, fileToWrite);
        List<String> result = fileReader.read(fileToWrite);
        assertEquals(expected, result);
    }


    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}