package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;

public class VowelCounter {

    private List<String> vowels = List.of("a", "e", "i", "o", "u");

    public int count(String word) {
        List<String> wordIntoCharacters = getSplitWord(word);
        return countVowels(wordIntoCharacters);
    }


    private List<String> getSplitWord(String word) {
        return List.of(word.split(""));
    }


    private int countVowels(List<String> wordIntoCharacters) {
        int counter = 0;
        for (String vowel : vowels) {
            for (int i = 0; i < wordIntoCharacters.size(); i++) {
                if (isLetterVowel(wordIntoCharacters, vowel, i)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private boolean isLetterVowel(List<String> wordIntoCharacters, String vowel, int i) {
        return wordIntoCharacters.get(i).equalsIgnoreCase(vowel);
    }
}
