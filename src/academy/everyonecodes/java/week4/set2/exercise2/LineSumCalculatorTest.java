package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class LineSumCalculatorTest {

    LineSumCalculator lineSumCalculator = new LineSumCalculator();

    @Test
    void calculateSeveralNumbers() {

        List<Integer> numbers = List.of(1,3);
        int result = lineSumCalculator.calculate(numbers);
        Assertions.assertEquals(4, result);

    }

    @Test
    void calculateWithOneNumber() {

        List<Integer> numbers = List.of(1);
        int result = lineSumCalculator.calculate(numbers);
        Assertions.assertEquals(1, result);

    }

    @Test
    void calculateWithZerosAndNegatives() {

        List<Integer> numbers = List.of(-1,3,0);
        int result = lineSumCalculator.calculate(numbers);
        Assertions.assertEquals(2, result);

    }

}
