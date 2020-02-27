package academy.everyonecodes.java.evaluation2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNameShifterTest {

    NumberNameShifter shifter = new NumberNameShifter();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("two", "three"), List.of("one", "two")),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of("two", "three"), List.of("one", "two", "nine")),
                Arguments.of(List.of("two", "three"), List.of("one", "two", "eight")),
                Arguments.of(List.of(), List.of("eight"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void shift(List<String> expected, List<String> input) {
        List<String> result = shifter.shift(input);
        assertEquals(expected, result);
    }

}