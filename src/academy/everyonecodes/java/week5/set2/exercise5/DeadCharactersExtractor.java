package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DeadCharactersExtractor {

    public void extract() {
        GotDataReader gotDataReader = new GotDataReader();
        List<Character> charactersList = gotDataReader.read();
        List<String> deadCharactersList = new ArrayList<>();
        for (Character character : charactersList) {
            if (!character.getBookOfDeath().equals(Optional.of(""))) {
                String deadCharacter = character.getName();
                deadCharactersList.add(deadCharacter);
            }
        }

        String newFile = "src/academy/everyonecodes/java/week5/set2/files/deaths.txt";
        Path path = Path.of(newFile);
        try {
            Files.write(path, deadCharactersList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
