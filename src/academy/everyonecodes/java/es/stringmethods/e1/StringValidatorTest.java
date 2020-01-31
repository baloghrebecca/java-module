package academy.everyonecodes.java.es.stringmethods.e1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringValidatorTest {

    StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @CsvSource({
            "false, ' '",
            "true, abc",
            "false, ''"
    })
    void validator(boolean expected, String input) {
        boolean result = stringValidator.validate(input);
        Assertions.assertEquals(expected, result);
    }
}