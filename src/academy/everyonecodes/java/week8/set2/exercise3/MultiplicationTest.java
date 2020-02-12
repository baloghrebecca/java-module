package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    Multiplication multiplication = new Multiplication();

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1",
            "0, 0, 0",
            "2.5, 5, 0.5"
    })
    void operate(double expected, double number1, double number2) {
        double result = multiplication.operate(number1, number2);
        Assertions.assertEquals(expected, result);
    }
}