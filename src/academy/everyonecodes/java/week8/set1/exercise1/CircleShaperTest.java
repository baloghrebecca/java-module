package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleShaperTest {

    @Test
    void getShape() {

        CircleShaper circleShaper = new CircleShaper();
        Shaper shaper = circleShaper;
        Shaper anotherShaper =  new CircleShaper();

        Assertions.assertEquals("Circle", circleShaper.getShape());
        Assertions.assertEquals("Circle", shaper.getShape());
        Assertions.assertEquals("Circle", anotherShaper.getShape());
    }

}