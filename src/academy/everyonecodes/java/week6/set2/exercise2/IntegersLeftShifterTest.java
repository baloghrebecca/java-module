package academy.everyonecodes.java.week6.set2.exercise2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegersLeftShifterTest {

    IntegersLeftShifter integersLeftShifter = new IntegersLeftShifter();

    @Test
    void shifterWithListOfWholeNumbers() {
        List<Integer> numbers = List.of(1,3,4,5);
        List<Integer> expected = List.of(3,4,5,1);
        List<Integer> result = integersLeftShifter.shiftOne(numbers);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shifterWithEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> expected = List.of();
        List<Integer> result = integersLeftShifter.shiftOne(numbers);
        Assertions.assertEquals(expected, result);
    }

}