package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class KilometerToMilesConverterTest {

    KilometerToMilesConverter kilometerToMilesConverter = new KilometerToMilesConverter();

    @ParameterizedTest
    @CsvSource({
        "0.62, 1", "1.24, 2", "0, 0"
    })

    void convert (double expected, double numberOfKilometers) {
        double result = kilometerToMilesConverter.convert(numberOfKilometers);
        Assertions.assertEquals(expected, result);
    }

}
