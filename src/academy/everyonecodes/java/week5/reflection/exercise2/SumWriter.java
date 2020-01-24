package academy.everyonecodes.java.week5.reflection.exercise2;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumWriter {

    private String newFile = "src/academy/everyonecodes/java/week5/reflection/files/output.csv";
    private String fileToRead = "src/academy/everyonecodes/java/week5/reflection/files/input.csv";


    public void write() {
        LinesCalculator linesCalculator = new LinesCalculator();

        List<String> fileLines = read(fileToRead);
        List<String> sumsToWrite = linesCalculator.calculate(fileLines);
        Path path = Path.of(newFile);
        try {
            Files.write(path, sumsToWrite);
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





