package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpoonTest {

    Spoon spoon = new Spoon();

    @ParameterizedTest
    @CsvSource({
            "true, Soup",
            "true, soup",
            "false, Pizza",
            "false, ''"
    })
    void isUsedForWithMixedInputs(boolean expected, String input) {
        boolean result = spoon.isUsedFor(input);
        assertEquals(expected, result);
    }
}