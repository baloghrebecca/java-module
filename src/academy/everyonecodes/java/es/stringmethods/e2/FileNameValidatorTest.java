package academy.everyonecodes.java.es.stringmethods.e2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileNameValidatorTest {

    FileNameValidator fileNameValidator = new FileNameValidator();

    @ParameterizedTest
    @CsvSource({
            "true, PHOTO_fdkjfkd.png",
            "false, PHOTO_9393",
            "false, ''",
            "false, djdkd.png"
    })
    void validate(boolean expected, String word) {
        boolean result = fileNameValidator.validate(word);
        assertEquals(expected, result);
    }

}