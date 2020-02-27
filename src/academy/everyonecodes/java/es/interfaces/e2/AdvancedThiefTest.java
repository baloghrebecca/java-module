package academy.everyonecodes.java.es.interfaces.e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdvancedThiefTest {

    AdvancedThief advancedThief = new AdvancedThief();
    Safe safe = new Safe (2, "low");

    @Test
    void thief() {
        advancedThief.open(safe);
        Assertions.assertEquals(0, safe.getSecurityPoints());
    }

}