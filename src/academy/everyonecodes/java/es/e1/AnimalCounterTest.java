package academy.everyonecodes.java.es.e1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnimalCounterTest {

    AnimalCounter animalCounter = new AnimalCounter();

    @ParameterizedTest
    @CsvSource({
            "3"
    })
    void counter(int expected) {
        int result = animalCounter.counter();
        Assertions.assertEquals(expected, result);
    }

}