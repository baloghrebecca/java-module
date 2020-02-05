package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class HappinessDataReaderTest {

    HappinessDataReader happinessDataReader = new HappinessDataReader();

    @Test
    void dataReaderWithRightValuesInFirstLine() {
        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        List<HappinessRecord> result = happinessDataReader.read();
        Assertions.assertEquals(expected.getRank(), result.get(0).getRank());
    }

    @Test
    void dataReaderWithRightValuesInLastLine() {
        HappinessRecord expected = new HappinessRecord("Ireland", 15, 6.97700023651123);
        List<HappinessRecord> result = happinessDataReader.read();
        Assertions.assertEquals(expected.getRank(), result.get(154).getRank());
    }

    @Test
    void dateReaderWithMatchingSize() {
        List<HappinessRecord> result = happinessDataReader.read();
        Assertions.assertEquals(155, result.size());
    }

}