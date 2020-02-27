package academy.everyonecodes.java.evaluation2.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RegionOfMostSoldOrganicAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> avocadoEntries) {
        Optional<String> oRightEntry = avocadoEntries.stream()
                .filter(isNotTotalUS())
                .filter(isOrganic())
                .sorted(sortedByMostSold())
                .map(avocadoEntry -> "Region of most sold organic is: " + avocadoEntry.getRegion() + " with " + avocadoEntry.getTotalSold())
                .findFirst();

        if (oRightEntry.isPresent()) {
            return oRightEntry.get();
        }
        return "Region of most sold organic is: Result not found";
    }

    Comparator<AvocadoEntry> sortedByMostSold() {
        return Comparator.comparing(AvocadoEntry::getTotalSold).reversed();
    }

    Predicate<AvocadoEntry> isOrganic() {
        return avocadoEntry -> avocadoEntry.getType().equalsIgnoreCase("organic");
    }

    Predicate<AvocadoEntry> isNotTotalUS() {
        return avocadoEntry -> !avocadoEntry.getRegion().equalsIgnoreCase("TotalUs");
    }
}

