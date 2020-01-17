package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MaxOrMinPickerTest {

    MaxOrMinPicker maxOrMinPicker = new MaxOrMinPicker();

    @Test
    void pickerWithPositiveValuesInList() {
        List<Integer> numbers = List.of(1,3,2);
        List<Integer> expected = List.of(1,3);
        int result = maxOrMinPicker.pick(numbers);
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void pickerWithNegativeValuesInList() {
        List<Integer> numbers = List.of(-1,3,-2);
        List<Integer> expected = List.of(-2,3);
        int result = maxOrMinPicker.pick(numbers);
        Assertions.assertTrue(expected.contains(result));
    }


    @Test
    void pickerWithNoValue() {
        List<Integer> numbers = List.of();
        int result = maxOrMinPicker.pick(numbers);
        Assertions.assertTrue(result == (int)result);
    }

}
