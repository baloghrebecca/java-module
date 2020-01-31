package academy.everyonecodes.java.es.stringmethods.e1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DataReaderTest {

    DataReader dataReader = new DataReader();

    @Test
    void readerWithEmptyString() {
        List<String> result = dataReader.read("");
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void readerWithString() {
        List<String> expected = List.of("FIRST", "SECOND");
        List<String> result = dataReader.read("first,second");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void readerWithOneElement() {
        List<String> expected = List.of("FIRST");
        List<String> result = dataReader.read("first");
        Assertions.assertEquals(expected, result);
    }


}