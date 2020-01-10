package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AbsoluteValueCalculatorTest {

    AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

    @ParameterizedTest
    @CsvSource({
        "4.00, -4.00", "100.00, -100.00", "5.00, -5.00"
    })

    void calculate(double expected, double number) {

        double result = absoluteValueCalculator.calculate(number);
        Assertions.assertEquals(expected, result);
    }



}
