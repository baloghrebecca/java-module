package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DeadCharactersExtractorTest {

    DeadCharactersExtractor deadCharactersExtractor = new DeadCharactersExtractor();
    FileReader fileReader = new FileReader();

    @Test
    void extractorSameAsFileToCompare() {
        deadCharactersExtractor.extract();
        String fileNew = "src/academy/everyonecodes/java/week5/set2/files/deaths.txt";
        List<String> result = fileReader.read(fileNew);
        String fileToCompare = "src/academy/everyonecodes/java/week5/set2/files/deaths_expected.txt";
        List<String> expected = fileReader.read(fileToCompare);
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/deaths.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}