package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumWriterTest {

    SumWriter sumWriter = new SumWriter();
    private String expectedFile = "src/academy/everyonecodes/java/week5/set2/files/input.txt";
    private String resultFile = "src/academy/everyonecodes/java/week5/set2/files/output.txt";

    @Test
    void write() {

        sumWriter.write();
        List<String> expected = read(resultFile);
        List<String> result = read(expectedFile);
        Assertions.assertEquals(expected, result);
    }


    @AfterEach
    void deleteNewNameFile() {
        Path path = Path.of(resultFile);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> read(String file) {
        Path path = Path.of(file);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}