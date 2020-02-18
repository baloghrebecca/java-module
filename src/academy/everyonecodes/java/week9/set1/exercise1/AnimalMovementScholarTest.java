package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalMovementScholarTest {

    AnimalMovementScholar animalMovementScholar = new AnimalMovementScholar();

    @ParameterizedTest
    @CsvSource({
            "'run, walk', dog",
            "'climb, run, walk', mammal"
    })
    void elaborate(String expected, String input) {
        Optional<String> oResult = animalMovementScholar.elaborate(input);
        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "true, cat",
            "true, abcd"
    })
    void elaborateWithEmpty(String expected, String input) {
        Optional<String> oResult = animalMovementScholar.elaborate(input);
        assertTrue(oResult.isEmpty());
    }

}