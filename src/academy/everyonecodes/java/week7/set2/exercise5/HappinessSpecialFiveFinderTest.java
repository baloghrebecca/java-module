package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessSpecialFiveFinderTest {

    HappinessSpecialFiveFinder happinessSpecialFiveFinder = new HappinessSpecialFiveFinder();
    HappinessDataReader happinessDataReader = new HappinessDataReader();

    @Test
    void specialFiveFinder() {
        List<HappinessRecord> happinessRecords = happinessDataReader.read();
        List<String> expected = List.of("Country: Burkina Faso Rank: 134",
                "Country: Afghanistan Rank: 141",
                "Country: Madagascar Rank: 144",
                "Country: South Sudan Rank: 147",
                "Country: Central African Republic Rank: 155");
        List<String> result = happinessSpecialFiveFinder.findSpecialFive(happinessRecords);

    }

}