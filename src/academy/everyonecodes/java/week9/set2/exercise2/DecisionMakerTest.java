package academy.everyonecodes.java.week9.set2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecisionMakerTest {

    private DecisionMaker decisionMaker = new DecisionMaker();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Player One is a winner!", new Rock(), new Scissors()),
                Arguments.of("Player One is a winner!", new Scissors(), new Paper()),
                Arguments.of("Player One is a winner!", new Paper(), new Rock()),
                Arguments.of("Player Two is a winner!", new Rock(), new Paper()),
                Arguments.of("Player Two is a winner!", new Scissors(), new Rock()),
                Arguments.of("Player Two is a winner!", new Paper(), new Scissors()),
                Arguments.of("Nobody wins! Try again!", new Rock(), new Rock()),
                Arguments.of("Nobody wins! Try again!", new Scissors(), new Scissors()),
                Arguments.of("Nobody wins! Try again!", new Paper(), new Paper())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void decisionMaker(String expected, Move one, Move two) {
        String result = decisionMaker.decisionMaker(one, two);

        assertEquals(expected, result);
    }

}
