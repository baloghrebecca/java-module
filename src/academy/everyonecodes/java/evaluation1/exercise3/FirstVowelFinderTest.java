package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstVowelFinderTest {

    FirstVowelFinder firstVowelFinder = new FirstVowelFinder();

    @ParameterizedTest
    @CsvSource({
            "a, Apple",
            "a, abcdefgh",
            "e, EPPLE",
    })
    void counterWithoutExeptions(String expected, String word) {
        Optional<String> oResult = firstVowelFinder.find(word);
        assertTrue(oResult.isPresent());
        String result = oResult.get();
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "bcd",
            "dddddddd",
            "PPPPPP",
            "' '",
            "''"
    })
    void counterWithEmptyReturns(String word) {
        Optional<String> oResult = firstVowelFinder.find(word);
        assertTrue(oResult.isEmpty());
    }


}