package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.*;

public class DoubleListMaximumFinder {

    public Optional<Double> finder(List<Double> doubles) {
        ArrayList<Double> doublesCopy = new ArrayList<>(doubles);
        Collections.sort(doublesCopy);
        if (!doublesCopy.isEmpty()) {
            Double biggestNumber = doublesCopy.get(doublesCopy.size()-1);
            return Optional.of(biggestNumber);
        }
        return Optional.empty();
    }


}
