package academy.everyonecodes.java.es.stringmethods.e4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstTwoDecimalsExtractorTest {

    FirstTwoDecimalsExtractor firstTwoDecimalsExtractor = new FirstTwoDecimalsExtractor();

    @ParameterizedTest
    @CsvSource({
            "43, 0.43",
            "10, 0.1",
            "25, 0.25999"
    })
    void extract(double expected, double input) {
        double result = firstTwoDecimalsExtractor.extract(input);
        Assertions.assertEquals(expected, result);
    }

}