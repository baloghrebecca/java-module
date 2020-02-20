package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.Money.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChangeUnitsCalculatorTest {

    ChangeUnitsCalculator calculate = new ChangeUnitsCalculator();

    private static Stream<Arguments> correctCalculation() {
        return Stream.of(
                Arguments.of(List.of(), 0),
                Arguments.of(List.of(new Euro100(), new Euro50()), 150.00),
                Arguments.of(List.of(new Euro100(), new Euro20()), 120.00),
                Arguments.of(List.of(new Euro200()), 200.00),
                Arguments.of(List.of(new Euro200(), new Cent50(), new Cent20(), new Cent10()), 200.80),
                Arguments.of(List.of(new Euro10(), new Cent10()), 10.10)
        );
    }


    @ParameterizedTest
    @MethodSource("correctCalculation")
    void calculate(List<MoneyUnit> expected, double moneyToGiveBack) {
        List<MoneyUnit> result = calculate.calculate(moneyToGiveBack);
        Assertions.assertEquals(expected.hashCode(), result.hashCode());
    }


}