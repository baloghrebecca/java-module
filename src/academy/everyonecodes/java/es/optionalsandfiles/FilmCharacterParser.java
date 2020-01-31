package academy.everyonecodes.java.es.optionalsandfiles;

import java.util.List;
import java.util.Optional;

public class FilmCharacterParser {

    public Optional<FilmCharacter> parse(String characterName) {
        List<String> filmCharacterParsed = List.of(characterName.split(";"));
        if (filmCharacterParsed.size() <= 1) {
            return Optional.empty();
        }
        return getFilmCharacter(filmCharacterParsed);
    }

    private Optional<FilmCharacter> getFilmCharacter(List<String> filmCharacterParsed) {
        return Optional.of(new FilmCharacter(filmCharacterParsed.get(0), filmCharacterParsed.get(1)));
    }
}
