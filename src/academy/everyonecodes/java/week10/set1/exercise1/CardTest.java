package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CardTest {

    Card card = new Card();

    @ParameterizedTest
    @CsvSource({
            "Mastercard, 5555555555554444",
            "Visa, 4222222222222",
    })
    void checkForCreditCard(String expected, String number) {
        String result = card.checker(number);
        Assertions.assertEquals(expected, result);

    }
}