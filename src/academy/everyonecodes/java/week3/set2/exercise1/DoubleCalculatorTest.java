package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DoubleCalculatorTest {

    DoubleCalculator doubleCalculator = new DoubleCalculator();

    @ParameterizedTest
    @CsvSource({
            "12.30, 6.15, 6.15", "6.00, 3.00, 3.00", "0.00, 0.00, 0.00"
    })

    void sumDouble (double expected, double doubleOne, double doubleTwo) {
        double result = doubleCalculator.doubleSum(doubleOne, doubleTwo);
        Assertions.assertEquals(expected, result);
    }

}
