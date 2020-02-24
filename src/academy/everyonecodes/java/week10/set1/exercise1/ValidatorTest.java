package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidatorTest {

    Validator validator = new Validator();

    @ParameterizedTest
    @CsvSource({
            "true, 378282246310005",
            "true, 5555555555554444",
            "false, 5202"
    })
    void isCorrectCard(boolean expected, String creditCardNumber) {
        boolean result = validator.validate(creditCardNumber);
        assertEquals(expected, result);
    }
}