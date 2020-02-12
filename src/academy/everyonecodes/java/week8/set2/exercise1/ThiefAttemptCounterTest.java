package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ThiefAttemptCounterTest {


    ThiefAttemptCounter thiefAttemptCounter = new ThiefAttemptCounter();

    private static Stream<Arguments> correctAttemptsAdvanced() {
        return Stream.of(
                Arguments.of(3, new AdvancedThief(), new Safe(6, 1)),
                Arguments.of(0, new AdvancedThief(), new Safe(0, 1))
        );
    }

    private static Stream<Arguments> correctAttemptsBeginner() {
        return Stream.of(
                Arguments.of(2, new BeginnerThief(), new Safe(2, 1)),
                Arguments.of(0, new BeginnerThief(), new Safe(0, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("correctAttemptsAdvanced")
    void countAttemptsAdvanced(int expected, Thief thief, Safe safe) {
        int result = thiefAttemptCounter.countAttempts(thief, safe);

        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @MethodSource("correctAttemptsBeginner")
    void countAttemptsBeginner(int expected, Thief thief, Safe safe) {
        int result = thiefAttemptCounter.countAttempts(thief, safe);
        Assertions.assertEquals(expected, result);

    }


}