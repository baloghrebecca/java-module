package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

class DoubleListSumCalculatorTest {

    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

    @Test
    void calculator() {

        List<Double> numbers = List.of(2.00, 1.00);

        double result = doubleListSumCalculator.calculator(numbers);

        double expected = 3.00;

        Assertions.assertEquals(expected, result);

    }

    @Test
    void calculator2() {

        List<Double> numbers = List.of(1.00);

        double result = doubleListSumCalculator.calculator(numbers);

        double expected = 1.00;

        Assertions.assertEquals(expected, result);

    }

    @Test
    void calculator3() {

        List<Double> numbers = List.of(7.00, 1.00, 1.00);

        double result = doubleListSumCalculator.calculator(numbers);

        double expected = 9.00;

        Assertions.assertEquals(expected, result);

    }

}
