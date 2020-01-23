package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GotDataReader {

    public List<Character> read() {
        GotDataParser gotDataParser = new GotDataParser();
        String file = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";
        Path path = Path.of(file);
        List<String> characters;
        try {
            characters = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        List<Character> charactersList = new ArrayList<>();
        for (int i = 1; i < characters.size(); i++) {
            Character currentCharacter = gotDataParser.parse(characters.get(i));
            charactersList.add(currentCharacter);
        }
        return charactersList;
    }
}
