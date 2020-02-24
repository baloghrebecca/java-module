package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmericanExpressTest {

    AmericanExpress americanExpress = new AmericanExpress();

    @ParameterizedTest
    @CsvSource({
            "true, 378282246310005",
            "false, 5055555555554444",
            "false, 55555555555544"
    })
    void isCorrectCard(boolean expected, long creditCardNumber) {
        boolean result = americanExpress.isCorrectCard(creditCardNumber);
        assertEquals(expected, result);
    }
}