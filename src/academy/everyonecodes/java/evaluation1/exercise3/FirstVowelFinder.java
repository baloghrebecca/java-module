package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;
import java.util.Optional;

public class FirstVowelFinder {


    private List<String> vowels = List.of("a", "e", "i", "o", "u");

    public Optional<String> find(String word) {
        List<String> wordIntoCharacters = getSplitWord(word);
        Optional<String> oVowel = checkForFirstVowelInWord(wordIntoCharacters);
        if (oVowel.isEmpty()) {
            return Optional.empty();
        }
        return oVowel;
    }


    private List<String> getSplitWord(String word) {
        return List.of(word.split(""));
    }

    private Optional<String> checkForFirstVowelInWord(List<String> wordIntoCharacters) {
        for (String vowel : vowels) {
            if (isLetterVowel(wordIntoCharacters, vowel)) {
                return Optional.of(vowel);
            }
        }
        return Optional.empty();
    }

    private boolean isLetterVowel(List<String> wordIntoCharacters, String vowel) {
        for (String wordIntoCharacter : wordIntoCharacters) {
            if (wordIntoCharacter.equalsIgnoreCase(vowel)) {
                return true;
            }
        }
        return false;
    }


}
