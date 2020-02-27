package academy.everyonecodes.java.week8.additional.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MostHamWordTest {

    MostHamWord mostHamWord = new MostHamWord();

    @Test
    void wordMostUsed() {
        String result = mostHamWord.wordMostUsed();
        Assertions.assertEquals("to", result);
    }

    @Test
    void getAllWords() {
        List<String> input = List.of("Ok lar", "Ok oni");
        List<String> expected = List.of("ok", "lar", "ok", "oni");
        List<String> result = mostHamWord.getAllWords(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getContentWithoutPunctio() {
        List<String> input = List.of("Ok lar... Joking wif u oni...", "Ok lar... Joking wif u oni...");
        List<String> expected = List.of("Ok lar Joking wif u oni", "Ok lar Joking wif u oni");
        List<String> result = mostHamWord.getContentWithoutPunctio(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void remove() {
        String test = "Ok lar... Joking wif u oni...";
        String expected = "Ok lar Joking wif u oni";
        String result = mostHamWord.remove(test);
        Assertions.assertEquals(expected, result);
    }
}