package academy.everyonecodes.java.week4.reflection.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {

    public int pick(List<Integer> numbers) {
        Random random = new Random();
        List<Integer> numbersCopy = new ArrayList<>(numbers); //0, 1, 3
        List<Integer> numbersHighestAndLowest = new ArrayList<>();
        Collections.sort(numbersCopy);
        int sizeOfNumbersCopy = numbersCopy.size();
        if (numbers.isEmpty()) {
            return random.nextInt();
        }
        int lowestNumber = numbersCopy.get(0);
        numbersHighestAndLowest.add(lowestNumber);
        int highestNumber = numbersCopy.get(sizeOfNumbersCopy-1);
        numbersHighestAndLowest.add(highestNumber);
        int randomNumberBetweenZeroAndTwo = random.nextInt(2);
        int randomNumberFromList = numbersHighestAndLowest.get(randomNumberBetweenZeroAndTwo);
        return randomNumberFromList;

    }


}
