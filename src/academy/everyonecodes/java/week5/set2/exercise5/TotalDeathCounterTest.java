package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class TotalDeathCounterTest {

    TotalDeathCounter totalDeathCounter = new TotalDeathCounter();

    @Test
    void deathCounterNoException() {
        Character characterOne = new Character("Addam Marbrand", Optional.of("4"), "male");
        Character characterTwo = new Character("Talbert Serry", Optional.of("4"), "male");
        List<Character> list = List.of(characterOne, characterTwo);
        int result = totalDeathCounter.count(list);
        Assertions.assertEquals(2, result);
    }

    @Test
    void deathCounterWithEmptyValues() {
        Character characterOne = new Character("Addam Marbrand", Optional.of("4"), "male");
        Character characterTwo = new Character("Talbert Serry", Optional.of(""), "male");
        List<Character> list = List.of(characterOne, characterTwo);
        int result = totalDeathCounter.count(list);
        Assertions.assertEquals(1, result);
    }


}
