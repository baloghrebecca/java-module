package academy.everyonecodes.java.week8.reflection.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaiterTest {

    Waiter waiter = new Waiter();

    private static Stream<Arguments> returnsCorrectList() {
        return Stream.of(
                Arguments.of(List.of("Spoon"), "soup"),
                Arguments.of(List.of("Fork", "Knife"), "Fish"),
                Arguments.of(List.of("Fork", "Knife"), "pizza")
        );
    }

    @ParameterizedTest
    @MethodSource("returnsCorrectList")
    void countAttemptsAdvanced(List<String> expected, String inputDish) {
        List<String> result = waiter.getCutlery(inputDish);
        assertEquals(expected, result);
    }
}