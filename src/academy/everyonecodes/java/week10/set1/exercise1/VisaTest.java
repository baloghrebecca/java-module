package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisaTest {

    Visa visa = new Visa();

    @ParameterizedTest
    @CsvSource({
            "true, 4012888888881881",
            "true, 4222222222222",
            "false, 555555555555444"
    })
    void isCorrectCard(boolean expected, long creditCardNumber) {
        boolean result = visa.isCorrectCard(creditCardNumber);
        assertEquals(expected, result);
    }
}