package academy.everyonecodes.java.week5.reflection.exercise1;

import java.util.Optional;

public class LetterPositionFinder {

    public Optional<Integer> find(String word, String letter) {
        for (int i = 0; i < word.length() ; i++) {
            String wordSubstring = word.substring(i,i+1);
            if (wordSubstring.equals(letter)) {
                return Optional.of(i);
            }
        }

        return Optional.empty();

    }

}
