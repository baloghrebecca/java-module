package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessSpecialFiveFinder {

    public List<String> findSpecialFive(List<HappinessRecord> happinessRecords) {
        List<String> specialFive = happinessRecords.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank).reversed())
                .filter(happinessRecord -> happinessRecord.getCountry().contains("a"))
                .filter(happinessRecord -> happinessRecord.getCountry().length() > 9)
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getRank)) //Objects need to be done with comparators
                .map(record -> "Country: " + record.getCountry() + " Rank: " + record.getRank())
                .collect(Collectors.toList());
        return specialFive;
    }

}
