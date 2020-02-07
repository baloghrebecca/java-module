package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Top5ParentalEducationFinderTest {

    Top5ParentalEducationFinder top5ParentalEducationFinder = new Top5ParentalEducationFinder();
    StudentPerformanceReader studentPerformanceReader = new StudentPerformanceReader();

    @Test
    void finderWithoutExceptions() {
        List<StudentPerformance> studentPerformanceList = studentPerformanceReader.read();
        List<String> expected = List.of("associate's degree", "some college", "bachelor's degree", "some college", "some college");
        List<String> result = top5ParentalEducationFinder.find(studentPerformanceList);
        assertEquals(expected, result);

    }


}