package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.List;

public class LineSumCalculator {

    public int calculate(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }

        return result;
    }

}
