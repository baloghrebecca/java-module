package academy.everyonecodes.java.es.stringmethods.e3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTripleExtractor {


    public List<Integer> extract(List<Integer> numbers) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        int randomNumberWithinRange = random.nextInt(numbers.size());
        for (int i = 0; i < 3; i++) {
            int number = numbers.get(randomNumberWithinRange);
            randomNumbers.add(number);
        }
        return randomNumbers;
    }
}
