package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise6.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthReaderTest {

    LineLengthReader lineLengthReader = new LineLengthReader();

    @Test
    void readerComparisonFirstElement() {
        List<Integer> result = lineLengthReader.read();
        Assertions.assertEquals(86, result.get(0));
    }

    @Test
    void readerComparisonLastElement() {
        List<Integer> result = lineLengthReader.read();
        Assertions.assertEquals(66, result.get(119));
    }

    @Test
    void readerRightSize() {
        List<Integer> result = lineLengthReader.read();
        Assertions.assertEquals(120, result.size());
    }

}