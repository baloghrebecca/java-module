package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoublesRightShifter {


    public List<Double> shiftTwo(List<Double> numbers) {
        List<Double> numbersMutable = new ArrayList<>(numbers);
        Collections.rotate(numbersMutable, 2);
        return numbersMutable;
    }
}
