package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumTest {

    Sum sum = new Sum();

    @ParameterizedTest
    @CsvSource({
            "2, 1, 1",
            "0, 0, 0",
            "1, 0.5, 0.5"
    })
    void operate(double expected, double number1, double number2) {
        double result = sum.operate(number1, number2);
        Assertions.assertEquals(expected, result);
    }
}