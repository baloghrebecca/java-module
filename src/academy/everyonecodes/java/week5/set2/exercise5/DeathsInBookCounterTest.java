package academy.everyonecodes.java.week5.set2.exercise5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class DeathsInBookCounterTest {

    DeathsInBookCounter deathsInBookCounter = new DeathsInBookCounter();

    @Test
    void counterWithAllNumbersSame(){
        Character newCharacterPeter = new Character("Peter", Optional.of("5"), "male");
        Character newCharacterTwo = new Character("Peter Pan", Optional.of("5"), "male");
        Character newCharacterThree = new Character("Peter Pan Peter", Optional.of("5"), "male");
        Character newCharacterFour = new Character("P", Optional.of("5"), "male");
        List<Character> list = List.of(newCharacterPeter, newCharacterThree, newCharacterFour, newCharacterTwo);
        int result = deathsInBookCounter.count(list, 5);
        Assertions.assertEquals(4, result);
    }

    @Test
    void counterWithOneEmpty(){
        Character newCharacterPeter = new Character("Peter", Optional.empty(), "male");
        Character newCharacterTwo = new Character("Peter Pan", Optional.of("5"), "male");
        Character newCharacterThree = new Character("Peter Pan Peter", Optional.of("5"), "male");
        Character newCharacterFour = new Character("P", Optional.of("5"), "male");
        List<Character> list = List.of(newCharacterPeter, newCharacterThree, newCharacterFour, newCharacterTwo);
        int result = deathsInBookCounter.count(list, 5);
        Assertions.assertEquals(3, result);
    }

    @Test
    void counterWithInvalidInput(){
        Character newCharacterPeter = new Character("Peter", Optional.of("3"), "male");
        Character newCharacterTwo = new Character("Peter Pan", Optional.of("5book"), "male");
        Character newCharacterThree = new Character("Peter Pan Peter", Optional.of("5"), "male");
        Character newCharacterFour = new Character("P", Optional.of("0"), "male");
        List<Character> list = List.of(newCharacterPeter, newCharacterThree, newCharacterFour, newCharacterTwo);
        int result = deathsInBookCounter.count(list, 5);
        Assertions.assertEquals(1, result);
    }

}