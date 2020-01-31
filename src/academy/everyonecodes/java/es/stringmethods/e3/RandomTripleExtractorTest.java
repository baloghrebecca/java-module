package academy.everyonecodes.java.es.stringmethods.e3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RandomTripleExtractorTest {

    RandomTripleExtractor randomTripleExtractor = new RandomTripleExtractor();

    @Test
    void extractContainsElementsInList() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<Integer> result = randomTripleExtractor.extract(numbers);
        Assertions.assertTrue(numbers.contains(getItemsFor3Positions(result)));

    }

    private int getItemsFor3Positions(List<Integer> result) {
        int randomPosition = 0;
        for (int i = 0; i < 2; i++) {
            randomPosition = result.get(i);
        }
        return randomPosition;
    }


}