package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BeforeDashExtractorTest {

    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "hello, hello-world",
            "'', helloworld",
            "one, one-two-three"
    })

    void extractor(String expected, String word) {

        String result = beforeDashExtractor.extract(word);
        Assertions.assertEquals(expected, result);

    }

}
