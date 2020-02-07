package academy.everyonecodes.java.week7.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentPerformanceReader {

    private String file = "src/academy/everyonecodes/java/week7/reflection/files/students-performance.csv";
    private StudentPerformanceParser studentPerformanceParser = new StudentPerformanceParser();

    public List<StudentPerformance> read() {
        try {
            return getStudentPerformances();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    private List<StudentPerformance> getStudentPerformances() throws IOException {
        Path path = Path.of(file);
        return Files.lines(path)
                .skip(1)
                .map(line -> studentPerformanceParser.parseLine(line))
                .collect(Collectors.toList());
    }


}
