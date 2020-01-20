package academy.everyonecodes.java.week5.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListAverageCalculateTest {

    IntegerListAverageCalculate integerListAverageCalculate = new IntegerListAverageCalculate();


    @Test
    void calculateWithSeveralIntegersInTheList() {
        List<Integer> numbers = List.of(1,1,1);
        Optional<Integer> oResult = integerListAverageCalculate.calculate(numbers);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(1, oResult.get());
    }

    @Test
    void calculateWithEmptyList() {
        List<Integer> numbers = List.of();
        Optional<Integer> oResult = integerListAverageCalculate.calculate(numbers);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateWithOneNumber() {
        List<Integer> numbers = List.of(1);
        Optional<Integer> oResult = integerListAverageCalculate.calculate(numbers);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(1, oResult.get());
    }

}