package academy.everyonecodes.java.week5.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LetterPositionFinderTest {

    LetterPositionFinder letterPositionFinder = new LetterPositionFinder();

    @Test
    void finderWithLetterIncludedInWord() {
        Optional<Integer> oResult = letterPositionFinder.find("Becca", "e");
        Optional<Integer> oExpected = Optional.of(1);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(oExpected.get(), oResult.get());
    }

    @Test
    void finderWithLetterIncludedInWordTwoTimes() {
        Optional<Integer> oResult = letterPositionFinder.find("Rebecca", "e");
        Optional<Integer> oExpected = Optional.of(1);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(oExpected.get(), oResult.get());
    }

    @Test
    void finderWithoutLetterIncludedInWord() {
        Optional<Integer> oResult = letterPositionFinder.find("Jack", "e");
        Assertions.assertTrue(oResult.isEmpty());
    }
}