package academy.everyonecodes.java.week6.set2.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialNumbersCounterTest {

    SpecialNumbersCounter specialNumbersCounter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "1, 111123",
            "3, 30269",
            "0, -3",
            "6, 99993846",
    })
    void counterMixedNumbersAndNoNumberInput(int expected, int input) {
        int result = specialNumbersCounter.count(input);
        Assertions.assertEquals(expected, result);
    }

}