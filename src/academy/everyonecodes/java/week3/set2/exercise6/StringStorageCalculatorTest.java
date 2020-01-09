package academy.everyonecodes.java.week3.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringStorageCalculatorTest {


    StringStorageCalculator stringStorageCalculator = new StringStorageCalculator();

    @ParameterizedTest
    @CsvSource({
        "112, 'Hello'", "32, ''", "256 ,'Rebecca Balogh'"

    })

    void calculate (int expected, String word) {

        int result = stringStorageCalculator.calculate(word);
        Assertions.assertEquals(expected, result);

    }

}
