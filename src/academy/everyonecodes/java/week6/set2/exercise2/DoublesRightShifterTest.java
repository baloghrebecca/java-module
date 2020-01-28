package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoublesRightShifterTest {

    DoublesRightShifter doublesRightShifter = new DoublesRightShifter();

    @Test
    void shifterWithListOfWholeNumbers() {
        List<Double> numbers = List.of(1.0,3.0,4.0,5.0);
        List<Double> expected = List.of(4.0,5.0,1.0,3.0);
        List<Double> result = doublesRightShifter.shiftTwo(numbers);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shifterWithEmptyList() {
        List<Double> numbers = List.of();
        List<Double> expected = List.of();
        List<Double> result = doublesRightShifter.shiftTwo(numbers);
        Assertions.assertEquals(expected, result);
    }

}