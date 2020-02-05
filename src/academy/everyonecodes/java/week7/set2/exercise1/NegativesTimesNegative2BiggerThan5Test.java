package academy.everyonecodes.java.week7.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class NegativesTimesNegative2BiggerThan5Test {

    @Test
    void test() {
        List<Double> doubles = List.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6);

        List<Double> result = doubles.stream()
                .filter(number -> number < 0.0)
                .map(number -> number * -2.0)
                .filter(number -> number > 5.0)
                .collect(Collectors.toList());
        List<Double> expected = List.of(6.2, 5.2);
        Assertions.assertEquals(expected, result);
    }
}
