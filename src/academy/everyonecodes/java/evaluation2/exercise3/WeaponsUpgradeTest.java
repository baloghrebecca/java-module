package academy.everyonecodes.java.evaluation2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class WeaponsUpgradeTest {

    WeaponsUpgrade weaponsUpgrade = new WeaponsUpgrade(10);

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new Spaceship(1, 12), new Spaceship(1, 2)),
                Arguments.of(new Spaceship(1, 10), new Spaceship(1, 0)),
                Arguments.of(new Spaceship(1, 9), new Spaceship(1, -1))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void apply(Spaceship expected, Spaceship spaceship) {
        weaponsUpgrade.apply(spaceship);
        Assertions.assertEquals(expected.hashCode(), spaceship.hashCode());
    }

}