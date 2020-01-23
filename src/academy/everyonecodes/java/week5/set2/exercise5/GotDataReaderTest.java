package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GotDataReaderTest {

    GotDataReader gotDataReader = new GotDataReader();

    @Test
    void dataReaderWithRightValuesInFirstLine() {
        Character expected = new Character("Addam Marbrand", Optional.of(""), "male");
        List<Character> result = gotDataReader.read();
        Assertions.assertEquals(expected.getName(), result.get(0).getName());
    }


    @Test
    void dataReaderWithRightValuesInLastLine() {
        Character expected = new Character("Talbert Serry", Optional.of("4"), "male");
        List<Character> result = gotDataReader.read();
        Assertions.assertEquals(expected.getName(), result.get(result.size() - 1).getName());
    }


    @Test
    void dateReaderWithMatchingSize() {
        List<Character> result = gotDataReader.read();
        Assertions.assertEquals(917, result.size());
    }

}