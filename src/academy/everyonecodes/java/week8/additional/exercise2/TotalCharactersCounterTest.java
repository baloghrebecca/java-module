package academy.everyonecodes.java.week8.additional.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalCharactersCounterTest {

    TotalCharactersCounter totalCharactersCounter = new TotalCharactersCounter();
    GotReader gotReader = new GotReader();


    @Test
    void counter() {
        int result = totalCharactersCounter.counter(gotReader.reader());
        Assertions.assertEquals(917, result);
    }
}