package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalkingTimeTest {

    WalkingTime walkingTime = new WalkingTime();

    @Test
    void calculateWalkingTime() {
        int numberOfKilometers = 1;

        int result = walkingTime.calculateWalkingTime(numberOfKilometers);

        int expected = 15;

        Assertions.assertEquals(expected,result);


    }





}
