package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelCounterTest {

    VowelCounter vowelCounter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "0, bcd",
            "2, Apple",
            "2, abcdefgh",
            "2, APPLE",
            "0, ''",
            "0, '  '"
    })
    void counterWithMixedTests(int expected, String word) {
        int result = vowelCounter.count(word);
        assertEquals(expected, result);
    }


}