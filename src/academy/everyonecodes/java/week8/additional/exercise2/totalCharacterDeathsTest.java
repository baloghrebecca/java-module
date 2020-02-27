package academy.everyonecodes.java.week8.additional.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class totalCharacterDeathsTest {

    totalCharacterDeaths totalCharacterDeaths = new totalCharacterDeaths();
    GotReader gotReader = new GotReader();

    @Test
    void counterDeath() {
        int result = totalCharacterDeaths.counterDeath(gotReader.reader());
        Assertions.assertEquals(118, result);
    }
}