package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.evaluation1.tools.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

class AnimalsContainSTest {

    StreamFileReader streamFileReader = new StreamFileReader();
    FileLineAppender fileLineAppender = new FileLineAppender();
    FileReader fileReader = new FileReader();
    String fileToWrite = "src/academy/everyonecodes/java/week7/set2/files/animals-s.txt";
    String fileToRead = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";
    String fileToCompare = "src/academy/everyonecodes/java/week7/set2/files/animals-s_expected.txt";

    @Test
    void test() {
        streamFileReader.readLines(fileToRead)
                .filter(animal -> animal.contains("s") || animal.contains("S"))
                .map(String::toUpperCase)
                .forEach(animal -> fileLineAppender.append(fileToWrite, animal));

        List<String> result = fileReader.read(fileToWrite);
        List<String> expected = fileReader.read(fileToCompare);
        Assertions.assertEquals(expected, result);
    }


    @AfterEach
    void deleteNewNameFile() {
        String contentRootPath = "src/academy/everyonecodes/java/week7/set2/files/animals-s.txt";
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
