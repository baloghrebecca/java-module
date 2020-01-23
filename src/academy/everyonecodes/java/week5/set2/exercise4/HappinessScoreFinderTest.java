package academy.everyonecodes.java.week5.set2.exercise4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class HappinessScoreFinderTest {

    HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();

    @Test
    void findWithRightValues() {
        HappinessRecord happinessRecordOne = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        HappinessRecord happinessRecordTwo = new HappinessRecord("Angola", 140, 3.79500007629395);
        HappinessRecord happinessRecordThree = new HappinessRecord("Afghanistan", 141, 3.79399991035461);
        List<HappinessRecord> happinessRecordList = List.of(happinessRecordOne, happinessRecordTwo, happinessRecordThree);
        Optional<Double> oResult = happinessScoreFinder.findFor(happinessRecordList, "Lesotho");
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(3.80800008773804, oResult.get());
    }

    @Test
    void findWithNonExistentCountry() {
        HappinessRecord happinessRecordOne = new HappinessRecord("LesothoTest", 139, 3.80800008773804);
        HappinessRecord happinessRecordTwo = new HappinessRecord("Angola", 140, 3.79500007629395);
        HappinessRecord happinessRecordThree = new HappinessRecord("Afghanistan", 141, 3.79399991035461);
        List<HappinessRecord> happinessRecordList = List.of(happinessRecordOne, happinessRecordTwo, happinessRecordThree);
        Optional<Double> oResult = happinessScoreFinder.findFor(happinessRecordList, "Lesotho");
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void findWithCountryIncludedInSmallLetters() {
        HappinessRecord happinessRecordOne = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        HappinessRecord happinessRecordTwo = new HappinessRecord("Angola", 140, 3.79500007629395);
        HappinessRecord happinessRecordThree = new HappinessRecord("Afghanistan", 141, 3.79399991035461);
        List<HappinessRecord> happinessRecordList = List.of(happinessRecordOne, happinessRecordTwo, happinessRecordThree);
        Optional<Double> oResult = happinessScoreFinder.findFor(happinessRecordList, "lesotho");
        Assertions.assertTrue(oResult.isEmpty());
    }

}