package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JumpCalculatorTest {

    JumpCalculator jumpCalculator = new JumpCalculator();

    @ParameterizedTest
    @CsvSource({
        "0, 0", "6, 1"
    })

    void calculate (int expected, int foodType) {
        int result = jumpCalculator.calculate(foodType);
        Assertions.assertEquals(expected, result);
    }

}
