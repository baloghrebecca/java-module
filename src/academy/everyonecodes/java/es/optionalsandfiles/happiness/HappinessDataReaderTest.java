package academy.everyonecodes.java.es.optionalsandfiles.happiness;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessDataReaderTest {

    HappinessDataReader happinessDataReader = new HappinessDataReader();

    @Test
    void readerWithoutException() {
        HappinessRecord expectedOne = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        HappinessRecord expectedTwo = new HappinessRecord("Ireland", 15, 6.97700023651123);
        List<HappinessRecord> result = happinessDataReader.read();
        assertEquals(expectedOne, result.get(0));
        assertEquals(expectedTwo, result.get(154));
    }

    @Test
    void readerWithRightSize() {
        List<HappinessRecord> result = happinessDataReader.read();
        Assertions.assertEquals(155, result.size());
    }


    private void assertEquals(HappinessRecord expected, HappinessRecord first) {
        Assertions.assertEquals(expected.getCountry(), first.getCountry());
        Assertions.assertEquals(expected.getRank(), first.getRank());
        Assertions.assertEquals(expected.getScore(), first.getScore());
    }

}