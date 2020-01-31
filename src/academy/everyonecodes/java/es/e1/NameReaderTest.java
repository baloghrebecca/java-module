package academy.everyonecodes.java.es.e1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameReaderTest {

    NameReader nameReader = new NameReader();

    @Test
    void readerWithAtLeastOneName() {
        String expected = "Jonah";
        Optional<String> oResult = nameReader.read();
        Assertions.assertTrue(oResult.isPresent());
        String result = oResult.get();
        assertEquals(expected, result);
    }

    @Test
    void readerWithNoName() {
        Optional<String> oResult = nameReader.read();
        Assertions.assertTrue(oResult.isEmpty());
    }



}