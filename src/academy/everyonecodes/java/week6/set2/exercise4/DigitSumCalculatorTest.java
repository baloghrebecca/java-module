package academy.everyonecodes.java.week6.set2.exercise4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DigitSumCalculatorTest {

    DigitSumCalculator digitSumCalculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "10, 532",
            "0, 000",
            "5, 32",
            "2, 2",
    })

    void sumCalculator(int expected, int number) {
        int result = digitSumCalculator.calculate(number);
        Assertions.assertEquals(expected, result);

    }

}