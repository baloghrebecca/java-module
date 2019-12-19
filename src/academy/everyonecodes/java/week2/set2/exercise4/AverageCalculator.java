package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class AverageCalculator {

    public static double calculateAverage(List<Integer> numbers) {
        int size = numbers.size();
        double distanceCalculator = 0;
        for (Integer number : numbers) {
            distanceCalculator = distanceCalculator + number;
        }
        double average = distanceCalculator / size;
        return average;
    }

}
