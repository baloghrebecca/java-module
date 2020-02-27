package academy.everyonecodes.java.evaluation2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SparePartsTest {

    SpareParts spareParts = new SpareParts(10);

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new Spaceship(12, 2), new Spaceship(2, 2)),
                Arguments.of(new Spaceship(8, 2), new Spaceship(-2, 2)),
                Arguments.of(new Spaceship(10, 2), new Spaceship(0, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void apply(Spaceship expected, Spaceship spaceship) {
        spareParts.apply(spaceship);
        Assertions.assertEquals(expected.hashCode(), spaceship.hashCode());
    }
}