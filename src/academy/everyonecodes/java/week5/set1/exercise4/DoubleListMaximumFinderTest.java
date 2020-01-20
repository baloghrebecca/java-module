package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMaximumFinderTest {

    DoubleListMaximumFinder doubleListMaximumFinder = new DoubleListMaximumFinder();

    @Test
    void findWithSeveralDoublesInList() {
        List<Double> doubles = List.of(1.00, 5.00, 3.00);
        Optional<Double> oResult = doubleListMaximumFinder.finder(doubles);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(5.00, oResult.get());
    }

    @Test
    void findWithOneDoubleInTheList() {
        List<Double> doubles = List.of(1.00);
        Optional<Double> oResult = doubleListMaximumFinder.finder(doubles);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(1.00, oResult.get());
    }

    @Test
    void findWithEmptyList() {
        List<Double> doubles = List.of();
        Optional<Double> oResult = doubleListMaximumFinder.finder(doubles);
        Assertions.assertTrue(oResult.isEmpty());
    }

}