package academy.everyonecodes.java.week8.additional.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpamLongestTest {

    SpamLongest spamLongest = new SpamLongest();

    @Test
    void longestSpam() {

        int result = spamLongest.longestSpam();
        Assertions.assertEquals(224, result);

    }
}