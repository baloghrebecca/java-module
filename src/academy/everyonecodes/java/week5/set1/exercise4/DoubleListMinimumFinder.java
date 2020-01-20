package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {

    public Optional<Double> finder(List<Double> doubles) {
        ArrayList<Double> doublesCopy = new ArrayList<>(doubles);
        Collections.sort(doublesCopy); //also can be done like in Robocode, reading is faster than writing
        if (!doublesCopy.isEmpty()) {
            Double smallestNumber = doublesCopy.get(0);
            return Optional.of(smallestNumber);
        }
        return Optional.empty();
    }

}
