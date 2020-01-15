package academy.everyonecodes.java.week4.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TipAdderTest {

    TipAdder tipAdder = new TipAdder();

    @ParameterizedTest
@CsvSource({
        "24.5, 23.14",
        "0.50, 0.10",
        "3.0, 2.45"
})

    void tipper (double expected, double payment) {

        double result = tipAdder.tipper(payment);
        Assertions.assertEquals(expected, result);

    }

}
