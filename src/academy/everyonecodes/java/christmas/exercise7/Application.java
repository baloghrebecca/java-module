package academy.everyonecodes.java.christmas.exercise7;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);
        Reverse numbersReversed = new Reverse();
        List<Integer> reversedNumbers = numbersReversed.reverse(numbers);
        System.out.println(reversedNumbers);

    }
}
