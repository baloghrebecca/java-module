package academy.everyonecodes.java.evaluation2.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LowestAveragePriceAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> avocadoEntries) {
        Optional<String> oRightEntry = avocadoEntries.stream()
                .sorted(sortByLowestPrice())
                .map(avocadoEntry -> "Lowest average price is: " + avocadoEntry.getAveragePrice() + " on " + avocadoEntry.getYear())
                .findFirst();

        if (oRightEntry.isPresent()) {
            return oRightEntry.get();
        }
        return "Lowest average price is: Result not found";
    }

    Comparator<AvocadoEntry> sortByLowestPrice() {
        return Comparator.comparing(AvocadoEntry::getAveragePrice);
    }
}
