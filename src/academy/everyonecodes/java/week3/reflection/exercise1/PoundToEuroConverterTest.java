package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PoundToEuroConverterTest {

    PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

    @ParameterizedTest
    @CsvSource({
        "0.85, 1", "0, 0", "8.5, 10"
    })

    void converter(double expected, double numberOfPounds) {

        double result = poundToEuroConverter.convert(numberOfPounds);
        Assertions.assertEquals(expected, result);

    }




}
