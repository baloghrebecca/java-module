package academy.everyonecodes.java.week3.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisionCalculatorTest {

    DivisionCalculator divisionCalculator = new DivisionCalculator();

    @ParameterizedTest
    @CsvSource({
        "6.25, 12.50, 2", "4, 8, 2", "6, 12, 2"
    })

    void divide (double expected, double numberOne, double numberTwo) {

        double result = divisionCalculator.divide(numberOne, numberTwo);
        Assertions.assertEquals(expected, result);
    }

}
