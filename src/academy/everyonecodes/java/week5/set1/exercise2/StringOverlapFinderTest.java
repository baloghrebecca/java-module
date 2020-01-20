package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class StringOverlapFinderTest {

    StringOverlapFinder stringOverlapFinder = new StringOverlapFinder();

    @ParameterizedTest
    @CsvSource({
            "el, Michael, Elias",
            "ta, Agata, Tata",
            "test, letest, testle"
    })

    void finder(String expected, String wordOne, String wordTwo) {

        Optional<String> oResult = stringOverlapFinder.find(wordOne, wordTwo);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
        "'', David, Rebecca",
            "'', Rebecca, David"
    })

    void finderWithoutOverlapping(String expected, String wordOne, String wordTwo) {

        Optional<String> oResult = stringOverlapFinder.find(wordOne, wordTwo);
        Assertions.assertTrue(oResult.isEmpty());
    }

}
