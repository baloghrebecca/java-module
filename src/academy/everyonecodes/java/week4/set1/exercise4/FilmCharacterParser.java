package academy.everyonecodes.java.week4.set1.exercise4;

public class FilmCharacterParser {

    public FilmCharacter parser(String name) {
        String[] nameSeparated = name.split(";");
        FilmCharacter filmCharacterName = new FilmCharacter(nameSeparated[0], nameSeparated[1]);

        return filmCharacterName;

    }




}
