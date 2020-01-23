package academy.everyonecodes.java.week5.set2.exercise4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class HappinessDataReaderTest {

    HappinessDataReader happinessDataReader = new HappinessDataReader();

    @Test
    void dataReaderWithRightValuesInFirstLine() {
        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        Optional<List<HappinessRecord>> oResult = happinessDataReader.read();
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getRank(), oResult.get().get(0).getRank());
    }

    @Test
    void dataReaderWithRightValuesInLastLine() {
        HappinessRecord expected = new HappinessRecord("Ireland", 15, 6.97700023651123);
        Optional<List<HappinessRecord>> oResult = happinessDataReader.read();
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getRank(), oResult.get().get(154).getRank());
    }

    @Test
    void dateReaderWithMatchingSize() {

        Optional<List<HappinessRecord>> oResult = happinessDataReader.read();
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(155, oResult.get().size());
    }



}




