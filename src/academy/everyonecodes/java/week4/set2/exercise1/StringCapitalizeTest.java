package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringCapitalizeTest {

    StringCapitalize stringCapitalize = new StringCapitalize();

    @ParameterizedTest
    @CsvSource({
            "Hello, hello", "Peter, Peter", "Check,  check"
    })

    void capitalize(String expected, String word) {

        String result = stringCapitalize.capitalize(word);
        Assertions.assertEquals(expected, result);

    }


}
