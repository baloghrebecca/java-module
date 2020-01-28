package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegersLeftShifter {
    public List<Integer> shiftOne(List<Integer> numbers) {
        List<Integer> numbersMutable = new ArrayList<>(numbers);
        Collections.rotate(numbersMutable, -1);
        return numbersMutable;
    }
}
