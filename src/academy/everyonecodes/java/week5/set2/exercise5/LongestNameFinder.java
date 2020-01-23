package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class LongestNameFinder {

    public Optional<Character> find(List<Character> characterList) {
        int lengthCharacterNameBiggest = 0;
        int indexCharacter = 0;
        for (int i = 0; i < characterList.size(); i++) {
            int lengthCharacterToCompare = characterList.get(i).getName().length();
            if (lengthCharacterNameBiggest < lengthCharacterToCompare) {
                lengthCharacterNameBiggest = lengthCharacterToCompare;
                indexCharacter = i;
            }
        }
        if (characterList.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(characterList.get(indexCharacter));

    }






}
