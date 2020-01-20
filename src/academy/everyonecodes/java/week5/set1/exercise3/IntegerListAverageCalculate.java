package academy.everyonecodes.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculate {

    public Optional<Integer> calculate(List<Integer> numbers) {
        Integer result = 0;
        for (Integer number : numbers) {
            result = result + number;
        }
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        result = result/numbers.size();

        return Optional.of(result);

    }


}
