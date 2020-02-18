package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalKindScholarTest {

    AnimalKindScholar animalKindScholar = new AnimalKindScholar();

    @ParameterizedTest
    @CsvSource({
            "mammal, dog",
            "'dog, gorilla', mammal",
            "'snake, turtle', reptile"
    })
    void elaborate(String expected, String input) {
        Optional<String> oResult = animalKindScholar.elaborate(input);
        assertTrue(oResult.isPresent());
        String result = oResult.get();
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @CsvSource({
            "true, cat",
            "true, insect",
    })
    void elaborateEmpty(String expected, String input) {
        Optional<String> oResult = animalKindScholar.elaborate(input);
        assertTrue(oResult.isEmpty());
    }


}