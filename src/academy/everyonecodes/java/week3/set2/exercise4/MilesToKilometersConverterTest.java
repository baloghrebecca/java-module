package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MilesToKilometersConverterTest {

    MilesToKilometersConverter milesToKilometers = new MilesToKilometersConverter();

    @ParameterizedTest
    @CsvSource({
        "1, 0.62", "2, 1.24", "0, 0"
    })

    void converter(double expected, double numberOfMiles) {

        double result = milesToKilometers.converter(numberOfMiles);
        Assertions.assertEquals(expected, result);

    }

}
