package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentPerformanceReaderTest {

    StudentPerformanceReader studentPerformanceReader = new StudentPerformanceReader();
    StudentPerformanceParser studentPerformanceParser = new StudentPerformanceParser();

    @Test
    void readerFirstLine() {
        String firstLine = "female;bachelor's degree;72;72;74";
        StudentPerformance expected = studentPerformanceParser.parseLine(firstLine);
        List<StudentPerformance> result = studentPerformanceReader.read();
        assertEquals(expected, result.get(0));
    }

    @Test
    void readerLastLine() {
        String firstLine = "female;some college;77;86;86";
        StudentPerformance expected = studentPerformanceParser.parseLine(firstLine);
        List<StudentPerformance> result = studentPerformanceReader.read();
        assertEquals(expected, result.get(999));
    }

    @Test
    void readerRightSize() {
        List<StudentPerformance> result = studentPerformanceReader.read();
        assertEquals(1000, result.size());
    }

}