package academy.everyonecodes.java.week4.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoubleListMedianCalculatorTest {

    DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();

    @Test
    void calculateWithOddSize() {

        List<Double> numbers = List.of(2.00, 1.00, 3.00);
        double result = doubleListMedianCalculator.calculate(numbers);
        Assertions.assertEquals(2.0, result);

    }

    @Test
    void calculateWithEvenSize() {

        List<Double> numbers = List.of(2.00, 1.00, 3.00, 4.00);
        double result = doubleListMedianCalculator.calculate(numbers);
        Assertions.assertEquals(2.5, result);

    }

    @Test
    void calculateWithOneElement() {
        List<Double> numbers = List.of(2.00);
        double result = doubleListMedianCalculator.calculate(numbers);
        Assertions.assertEquals(2.0, result);
    }

}
