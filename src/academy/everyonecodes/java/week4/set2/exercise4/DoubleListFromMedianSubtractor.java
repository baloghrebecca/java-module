package academy.everyonecodes.java.week4.set2.exercise4;

import academy.everyonecodes.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {

    public List<Double> subtract(List<Double> numbers) {
        DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();
        ArrayList<Double> numbersCopy = new ArrayList<>(numbers);
        ArrayList<Double> numbersSubtractedByMedian = new ArrayList<>();
        double medianOfNumbersCopy = doubleListMedianCalculator.calculate(numbersCopy);
        for (double number : numbersCopy) {
            double resultMinusMedian = number - medianOfNumbersCopy;
            numbersSubtractedByMedian.add(resultMinusMedian);
        }

        return numbersSubtractedByMedian;

    }


}
