package academy.everyonecodes.java.week3.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReverseTest {

    Reverse reverse = new Reverse();

    @Test
    void reverse() {

        List<Integer> numbers = List.of(1,2,3,4);

        List<Integer> result = reverse.reverse(numbers);

        List<Integer> expected = List.of(4,3,2,1);

        Assertions.assertEquals(expected, result);


    }

}
