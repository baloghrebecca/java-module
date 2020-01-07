package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TramTimeTest {

    TramTime tramTime = new TramTime();

    @Test
    void calculateTramTime() {

        int numberOfStations = 1;

        int result = tramTime.calculateTramTime(numberOfStations);

        int expected = 4;

        Assertions.assertEquals(expected, result);

    }


}
