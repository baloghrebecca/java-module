package academy.everyonecodes.java.week7.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class StartWithMCountCharactersTest {

    @Test
    void test() {

        List<String> names = List.of("Mary", "Joe", "Max", "Laura");
        Optional<Integer> oResult = names.stream()
                .filter(name -> name.contains("M"))
                .map(String::length)
                .reduce(Integer::sum);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(7, oResult.get());
    }

}
