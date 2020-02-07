package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceParserTest {

    StudentPerformanceParser studentPerformanceParser = new StudentPerformanceParser();

    @Test
    void parserWithoutExceptions() {
        String line = "female;bachelor's degree;72;72;74";
        StudentPerformance expected = new StudentPerformance("female", "bachelor's degree", 72, 72, 74);
        StudentPerformance result = studentPerformanceParser.parseLine(line);
        assertEquals(expected, result);
    }

}