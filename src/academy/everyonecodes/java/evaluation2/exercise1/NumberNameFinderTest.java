package academy.everyonecodes.java.evaluation2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNameFinderTest {

    NumberNameFinder finder = new NumberNameFinder();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("TWO"), List.of("one", "two")),
                Arguments.of(Optional.empty(), List.of()),
                Arguments.of(Optional.of("TWO"), List.of("one", "two", "nine")),
                Arguments.of(Optional.of("ZERO"), List.of("one", "two", "zero"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void find(Optional<String> oExpected, List<String> input) {
        Optional<String> oResult = finder.find(input);
        assertEquals(oExpected, oResult);
    }

}