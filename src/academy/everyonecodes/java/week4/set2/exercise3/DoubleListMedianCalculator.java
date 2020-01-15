package academy.everyonecodes.java.week4.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {

    public double calculate(List<Double> numbers) {
        double result = 0.00;
        List<Double> numbersCopy = new ArrayList<>(numbers); //copy of the original numbers, so we can modify it
        Collections.sort(numbersCopy);
        int sizeOfArray = numbersCopy.size();
        if (sizeOfArray % 2 != 0) { //here i check if the number if even or odd
            result = numbersCopy.get(sizeOfArray/2);
        } else {
            result = (numbersCopy.get(sizeOfArray/2)+ numbersCopy.get((sizeOfArray/2)-1)) / 2;
        }

        return result;
    }


}
