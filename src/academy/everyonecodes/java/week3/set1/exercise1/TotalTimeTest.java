package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TotalTimeTest {

    TotalTime totalTime = new TotalTime();

    @Test
    void calculateTotalTime() {

        int tramStations = 1;
        int numberOfKilometersWalking = 1;
        int numberOfKilometersWalking2 = 2;

        int result = totalTime.calculateTotalTime(tramStations, numberOfKilometersWalking, numberOfKilometersWalking2);
        int expected = 49;
        Assertions.assertEquals(expected, result);


    }


}
