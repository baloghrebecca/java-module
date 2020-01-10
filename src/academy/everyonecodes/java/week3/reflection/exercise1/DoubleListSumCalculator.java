package academy.everyonecodes.java.week3.reflection.exercise1;

import java.util.List;

public class DoubleListSumCalculator {


    public double calculator(List<Double> numbers) {
        double result = 0.00;

        for (Double number : numbers) {
            result = result + number;
        }

        return result;
    }


}
