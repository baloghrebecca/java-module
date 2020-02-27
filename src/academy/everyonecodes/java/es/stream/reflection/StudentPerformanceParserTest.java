package academy.everyonecodes.java.es.stream.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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