package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GotDataParserTest {

    GotDataParser gotDataParser = new GotDataParser();

    @Test
    void parserWithNoException() {
        String input = "Adrack Humble;House Greyjoy;300;5;20;20;1;1;0;0;0;0;1";
        Character expected = new Character("Adrack Humble", Optional.of("5"), "male");
        Character result = gotDataParser.parse(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), result.getGender());
    }

    @Test
    void parserWithWrongGenderValue() {
        String input = "Adrack Humble;House Greyjoy;300;5;20;20;2;1;0;0;0;0;1";
        Character expected = new Character("Adrack Humble", Optional.of("5"), "");
        Character result = gotDataParser.parse(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.getBookOfDeath());
    }

    @Test
    void parserWithNoBookOfDeathInput() {
        String input = "Addam Marbrand;Lannister;;;;56;1;1;1;1;1;1;0";
        Character expected = new Character("Addam Marbrand", Optional.of(""), "male");
        Character result = gotDataParser.parse(input);
        Assertions.assertEquals(expected.getName(), result.getName());
        Assertions.assertEquals(expected.getBookOfDeath(), result.getBookOfDeath());
    }



}