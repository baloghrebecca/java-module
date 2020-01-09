package academy.everyonecodes.java.week3.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    @ParameterizedTest
    @CsvSource({
        "256.00, 4.00, 4.00", "1.00, 1.00, 0.00", "49.00, 7.00, 2.00"
    })

    void calculate(double expected, double numberOne, double numberTwo) {

        double result = powerCalculator.calculate(numberOne, numberTwo);
        Assertions.assertEquals(expected,result);

    }

}
