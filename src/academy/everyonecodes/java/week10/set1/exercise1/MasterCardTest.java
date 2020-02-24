package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MasterCardTest {

    MasterCard masterCard = new MasterCard();

    @ParameterizedTest
    @CsvSource({
            "true, 5555555555554444",
            "false, 5055555555554444",
            "false, 555555555555444"
    })
    void isCorrectCard(boolean expected, long creditCardNumber) {
        boolean result = masterCard.isCorrectCard(creditCardNumber);
        assertEquals(expected, result);
    }
}