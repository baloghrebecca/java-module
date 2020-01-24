package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.List;

public class IntegerListSumCalculator {

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

}
