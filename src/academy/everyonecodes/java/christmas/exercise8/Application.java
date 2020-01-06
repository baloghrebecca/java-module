package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Increment increment = new Increment();
        List<Integer> numbers = List.of(1, 2, 2, 4, 5, 6);
        List<Integer> updatedNumbers = increment.incrementedByOne(2, numbers);
        System.out.println(numbers);
        System.out.println(updatedNumbers);

    }


}


