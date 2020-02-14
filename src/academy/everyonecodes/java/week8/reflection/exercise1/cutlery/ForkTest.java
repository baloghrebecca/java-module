package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForkTest {

    Fork fork = new Fork();

    @ParameterizedTest
    @CsvSource({
            "false, Soup",
            "false, soup",
            "true, Pizza",
            "true, pizza",
            "false, ''"
    })
    void isUsedForWithMixedInputs(boolean expected, String input) {
        boolean result = fork.isUsedFor(input);
        assertEquals(expected, result);
    }

}