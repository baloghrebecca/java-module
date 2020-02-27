package academy.everyonecodes.java.es.stream.reflection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Top5ParentalEducationFinderTest {

    Top5ParentalEducationFinder top5ParentalEducationFinder = new Top5ParentalEducationFinder();
    StudentPerformanceReader studentPerformanceReader = new StudentPerformanceReader();

    @Test
    void finder() {

        List<StudentPerformance> studentPerformanceList = studentPerformanceReader.read();
        List<String> expected = List.of("associate's degree", "some college", "bachelor's degree", "some college", "some college");
        List<String> result = top5ParentalEducationFinder.finder(studentPerformanceList);
        assertEquals(expected, result);

    }
}