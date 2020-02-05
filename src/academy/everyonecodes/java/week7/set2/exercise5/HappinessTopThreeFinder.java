package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {

    public List<String> findTopThree(List<HappinessRecord> happinessRecords) {
        List<String> topThreeCountries = happinessRecords.stream()
                .sorted(Comparator.comparing(HappinessRecord::getScore).reversed())
                .limit(3)
                .map(happinessRecord -> "Country: " + happinessRecord.getCountry() + " Score: " + happinessRecord.getScore())
                .collect(Collectors.toList());
        return topThreeCountries;
    }

}
