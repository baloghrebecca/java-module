package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisionTest {

    Division division = new Division();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 2",
            "-2, -4, 2",
            "10, 5, 0.5"
    })
    void operate(double expected, double number1, double number2) {
        double result = division.operate(number1, number2);
        Assertions.assertEquals(expected, result);
    }
}