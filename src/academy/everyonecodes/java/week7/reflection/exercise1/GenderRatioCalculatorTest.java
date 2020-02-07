package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GenderRatioCalculatorTest {

    GenderRatioCalculator genderRatioCalculator = new GenderRatioCalculator();
    StudentPerformanceReader studentPerformanceReader = new StudentPerformanceReader();

    @Test
    void calculatorWithoutExceptions() {
        List<StudentPerformance> studentPerformanceList = studentPerformanceReader.read();
        String expected = "518:482";
        String result = genderRatioCalculator.calculate(studentPerformanceList);
        Assertions.assertEquals(expected, result);

    }

}