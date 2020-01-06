package academy.everyonecodes.java.christmas.exercise8;

import java.util.ArrayList;
import java.util.List;

public class ReplaceValue {

    public List<Integer> replaceValue(int newNumber, int position, List<Integer> numbers) {
        List<Integer> updatedNumbers = new ArrayList<>();
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            if (i == position) {
                updatedNumbers.add(newNumber);
            } else {
                updatedNumbers.add(numbers.get(i));
            }
        }
        return updatedNumbers;
    }


}
