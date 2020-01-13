package academy.everyonecodes.java.week4.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PngCheckerTest {

    PngChecker pngChecker = new PngChecker();

    @ParameterizedTest
    @CsvSource({
            "false, .jpg", "true, .PNG", "true, .pnG", "true, .png"
    })

    void checker(boolean expected, String fileName) {

        boolean result = pngChecker.checker(fileName);
        Assertions.assertEquals(expected, result);

    }

}
