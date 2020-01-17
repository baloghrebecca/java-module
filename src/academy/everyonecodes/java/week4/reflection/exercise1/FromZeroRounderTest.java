package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FromZeroRounderTest {

    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "-2.0, -1.54", "2, 1.54", "-1, -0.2"
    })

    void rounder(Double expected, Double number) {
        Double result = fromZeroRounder.round(number);
        Assertions.assertEquals(expected, result);
    }

}
