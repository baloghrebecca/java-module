package academy.everyonecodes.java.week4.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FilmCharacterParserTest {

    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    @ParameterizedTest
    @CsvSource({
            "Peter, Pan, Peter;Pan", "Jacky, Chan, Jacky;Chan", "Hello, Pello, Hello;Pello"

            })

       void parse(String expectedFirstName, String expectedSecondName, String input) {
        FilmCharacter result = filmCharacterParser.parser(input);
        Assertions.assertEquals(expectedFirstName, result.getFirstName());
        Assertions.assertEquals(expectedSecondName, result.getSecondName());
    }


}
