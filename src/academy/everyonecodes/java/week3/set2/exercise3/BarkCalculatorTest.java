package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BarkCalculatorTest {

    BarkCalculator barkCalculator = new BarkCalculator();

    @ParameterizedTest
    @CsvSource({
        "2, 1", "0, 0"
    })

    void calculate(int expected, int foodType) {

        int result = barkCalculator.calculate(foodType);
        Assertions.assertEquals(expected, result);
    }

}
