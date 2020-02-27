package academy.everyonecodes.java.evaluation2.exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class Analyser {

    private List<AvocadoAnalyser> analysers = List.of(new LowestAveragePriceAnalyser(), new RegionOfMostSoldOrganicAnalyser());

    public List<String> analyse(List<AvocadoEntry> avocadoEntries) {
        return analysers.stream()
                .map(analyser -> analyser.analyse(avocadoEntries))
                .collect(Collectors.toList());
    }
}
