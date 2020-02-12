package academy.everyonecodes.java.week8.set2.exercise3;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    Calculator calculator = new Calculator();

    private static Stream<Arguments> correctValue() {
        return Stream.of(
                Arguments.of(10, new Calculation("*", 5.0, 2.0)),
                Arguments.of(10, new Calculation("+", 5.0, 5.0)),
                Arguments.of(10, new Calculation("-", 20.0, 10.0)),
                Arguments.of(2.50, new Calculation("/", 5.0, 2.0))
        );
    }

    @ParameterizedTest
    @MethodSource("correctValue")
    void findSuperhero(double expected, Calculation calculation) {
        Optional<Double> oResult = calculator.calculate(calculation);
        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }


}