package academy.everyonecodes.java.week3.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TotalTimeTest {

    TotalTime totalTime = new TotalTime();

    @Test
    void calculateTotalTime() {

        int numberOfEpisodes = 2;

        int result = totalTime.calculateTotalTime(numberOfEpisodes);

        int expected = 84;

        Assertions.assertEquals(expected, result);

    }

}
