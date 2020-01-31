package academy.everyonecodes.java.es.optionalsandfiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class FilmCharacterParserTest {

    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    @Test
    void parsedFirstAndLastName() {

        FilmCharacter expected = new FilmCharacter("Anakin", "Skywalker");
        Optional<FilmCharacter> oResult = filmCharacterParser.parse("Anakin;Skywalker");
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getFirstName(), oResult.get().getFirstName());
        Assertions.assertEquals(expected.getSecondName(), oResult.get().getSecondName());
    }

    @Test
    void parsedEmptyString() {
        Optional<FilmCharacter> oResult = filmCharacterParser.parse("");
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void parsedWithIncorrectString() {
        Optional<FilmCharacter> oResult = filmCharacterParser.parse("Anakin");
        Assertions.assertTrue(oResult.isEmpty());
    }



}