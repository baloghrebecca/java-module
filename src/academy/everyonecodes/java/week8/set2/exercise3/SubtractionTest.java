package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    Subtraction subtraction = new Subtraction();

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "0, 0, 0",
            "0.5, 1, 0.5"
    })
    void operate(double expected, double number1, double number2) {
        double result = subtraction.operate(number1, number2);
        Assertions.assertEquals(expected, result);
    }
}
