package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdvancedThiefTest {

    AdvancedThief thief = new AdvancedThief();

    private static Stream<Arguments> returnsCorrectValue() {
        return Stream.of(
                Arguments.of(-2, new Safe(0, 0)),
                Arguments.of(0, new Safe(2, 2)),
                Arguments.of(1, new Safe(3, 3))
        );
    }

    @ParameterizedTest
    @MethodSource("returnsCorrectValue")
    void open(int expected, Safe safe) {
        thief.open(safe);
        int result = safe.getDifficultyPoints();
        assertEquals(expected, result);
    }

}