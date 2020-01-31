package academy.everyonecodes.java.es.stringmethods.e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateExtractorTest {

    DateExtractor dateExtractor = new DateExtractor();

    @ParameterizedTest
    @CsvSource({
            "10012020, PHOTO_10012020.png",
            "24122019 ,PHOTO_24122019.png"
    })
    void extractor(String expected, String fileName) {
        String result = dateExtractor.extractor(fileName);
        Assertions.assertEquals(expected, result);
    }


}