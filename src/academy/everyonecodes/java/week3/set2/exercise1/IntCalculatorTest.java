package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntCalculatorTest {

    IntCalculator intCalculator = new IntCalculator();

    @ParameterizedTest
    @CsvSource({
            "12, 6, 6", "6, 3, 3", "0, 0, 0"
    })

    void sumInt(int expected, int numberOne, int numberTwo) {
        int result = intCalculator.sumInt(numberOne, numberTwo);
        Assertions.assertEquals(expected, result);

    }

}
