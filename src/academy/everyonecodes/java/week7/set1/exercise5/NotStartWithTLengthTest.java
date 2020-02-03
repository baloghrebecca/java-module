package academy.everyonecodes.java.week7.set1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class NotStartWithTLengthTest {

    @Test
    void test() {
        List<String> words = List.of("Hello", "there", "General", "Kenobi");
        List<Integer> result = words.stream()
            .filter(word -> !word.startsWith("t"))
                .map(word -> word.length())
                .collect(Collectors.toList());
        List<Integer> expected = List.of(5, 7, 6);
        Assertions.assertEquals(expected, result);
    }

}
