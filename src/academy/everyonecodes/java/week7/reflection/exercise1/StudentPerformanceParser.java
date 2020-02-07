package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;

public class StudentPerformanceParser {

    public StudentPerformance parseLine(String line) {
        List<String> lineSplit = List.of(line.split(";"));
        return new StudentPerformance(
                lineSplit.get(0),
                lineSplit.get(1),
                Integer.parseInt(lineSplit.get(2)),
                Integer.parseInt(lineSplit.get(3)),
                Integer.parseInt(lineSplit.get(4))
        );

    }
}
