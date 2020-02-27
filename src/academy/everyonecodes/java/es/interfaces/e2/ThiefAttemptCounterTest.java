package academy.everyonecodes.java.es.interfaces.e2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThiefAttemptCounterTest {

    ThiefAttemptCounter thiefAttemptCounter = new ThiefAttemptCounter();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, new AdvancedThief(), new Safe(4, "high")),
                Arguments.of(1, new BeginnerThief(), new Safe(1, "low")),
                Arguments.of(0, new BeginnerThief(), new Safe(0, "open"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void open(int expected, Thief thief, Safe safe) {
        int result = thiefAttemptCounter.countAttempts(thief, safe);
        assertEquals(expected, result);
    }
}