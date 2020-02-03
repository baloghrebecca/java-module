package academy.everyonecodes.java.week7.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class RoundDownToAbsoluteBiggerThan1Test {

    @Test
    void test() {
        List<Double> doubles = List.of(1.5, -1.8, 3.5);
        Optional<Double> oResult = doubles.stream()
                .map(number -> Math.floor(number))
                .map(number -> Math.abs(number))
                .filter(number -> number > 1)
                .findFirst();

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(2.0, oResult.get());


    }

}
