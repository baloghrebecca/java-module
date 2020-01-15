package academy.everyonecodes.java.week4.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoubleListFromMedianSubtractorTest {

    DoubleListFromMedianSubtractor doubleListFromMedianSubtractor = new DoubleListFromMedianSubtractor();

    @Test
    void subtractWithOddCollectionSize() {
        List<Double> numbers = List.of(1.0, 4.0, 2.0, 10.0, 11.5);
        List<Double> expected = List.of(-3.0, 0.0, -2.0, 6.0, 7.5);
        List<Double> result = doubleListFromMedianSubtractor.subtract(numbers);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtractWithEvenCollectionSize() {
        List<Double> numbers = List.of(1.0, 4.0, 2.0, 10.0);
        List<Double> expected = List.of(-2.0, 1.0, -1.0, 7.0);
        List<Double> result = doubleListFromMedianSubtractor.subtract(numbers);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtractWithOneCollectionSize() {
        List<Double> numbers = List.of(1.0);
        List<Double> expected = List.of(0.0);
        List<Double> result = doubleListFromMedianSubtractor.subtract(numbers);
        Assertions.assertEquals(expected, result);
    }



}
