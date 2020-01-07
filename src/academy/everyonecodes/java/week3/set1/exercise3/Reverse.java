package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        int lastPosition = numbers.size() - 1;
        while (lastPosition >= 0){
            int number = numbers.get(lastPosition);
            reversedNumbers.add(number);
            lastPosition = lastPosition -1;
        }

        return reversedNumbers;
    }

}
