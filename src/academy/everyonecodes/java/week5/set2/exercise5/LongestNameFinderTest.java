package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class LongestNameFinderTest {

    LongestNameFinder longestNameFinder = new LongestNameFinder();

    @Test
    void findLongestNameWithNoExceptions() {
        Character newCharacterPeter = new Character("Peter", Optional.of("5"), "male");
        Character newCharacterTwo = new Character("Peter Pan", Optional.of("5"), "male");
        Character newCharacterThree = new Character("Peter Pan Peter", Optional.of("5"), "male");
        Character newCharacterFour = new Character("P", Optional.of("5"), "male");
        List<Character> list = List.of(newCharacterPeter, newCharacterThree, newCharacterFour, newCharacterTwo);
        Optional<Character> oResult = longestNameFinder.find(list);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(newCharacterThree.getName(), oResult.get().getName());
        Assertions.assertEquals(newCharacterThree.getBookOfDeath(), oResult.get().getBookOfDeath());
        Assertions.assertEquals(newCharacterThree.getGender(), oResult.get().getGender());
    }

    @Test
    void findNamesWithSameCharacterLength() {
        Character newCharacterPeter = new Character("Peter", Optional.of("5"), "male");
        Character newCharacterTwo = new Character("Tatan", Optional.of("5"), "male");
        Character newCharacterThree = new Character("Pe", Optional.of("5"), "male");
        Character newCharacterFour = new Character("P", Optional.of("5"), "male");
        List<Character> list = List.of(newCharacterPeter, newCharacterThree, newCharacterFour, newCharacterTwo);
        Optional<Character> oResult = longestNameFinder.find(list);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(newCharacterPeter.getName(), oResult.get().getName());
        Assertions.assertEquals(newCharacterThree.getBookOfDeath(), oResult.get().getBookOfDeath());
        Assertions.assertEquals(newCharacterPeter.getGender(), oResult.get().getGender());
    }

    @Test
    void findLongestNameWithNoName() {
        List<Character> list = List.of();
        Optional<Character> oResult = longestNameFinder.find(list);
        Assertions.assertTrue(oResult.isEmpty());
    }


}
