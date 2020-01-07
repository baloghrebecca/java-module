package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4);
        Reverse numbersReversed = new Reverse();
        List<Integer> reversedNumbers = numbersReversed.reverse(numbers);
        System.out.println(reversedNumbers);

    }
}
