package academy.everyonecodes.java.week7.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class KeepPositivesTest {

    @Test
    void test() {

        List<Integer> numbers = List.of(-1, 0, 1, 2, 3);
        List<Integer> result = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());

        List<Integer> expected = List.of(1, 2, 3);
        Assertions.assertEquals(expected, result);

    }

}
