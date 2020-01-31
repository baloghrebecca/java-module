package academy.everyonecodes.java.es.stringmethods.e1;

import java.util.ArrayList;
import java.util.List;

public class DataReader {


    public List<String> read(String word) {
        if (word.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> wordList = stringIntoWordList(word);
        List<String> wordListUpperCase = new ArrayList<>();
        for (String item : wordList) {
            String wordUpperCase = item.toUpperCase();
            wordListUpperCase.add(wordUpperCase);
        }
        return wordListUpperCase;
    }

    private List<String> stringIntoWordList(String word) {
        return List.of(word.split(","));
    }
}
