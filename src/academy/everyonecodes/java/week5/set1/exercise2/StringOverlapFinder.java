package academy.everyonecodes.java.week5.set1.exercise2;

import java.util.Optional;

public class StringOverlapFinder {

    public Optional<String> find(String wordOne, String wordTwo) {
        for (int i = 0; i < wordOne.length() ; i++) {
            String subStringOfWordOne = wordOne.substring(i);
            String wordTwoCaseless = wordTwo.toLowerCase();
            if (wordTwoCaseless.contains(subStringOfWordOne)
                    && wordTwoCaseless.substring(0,subStringOfWordOne.length()).equals(subStringOfWordOne)) {
                return Optional.of(subStringOfWordOne);
            }

        }
        return Optional.empty();
    }

}
