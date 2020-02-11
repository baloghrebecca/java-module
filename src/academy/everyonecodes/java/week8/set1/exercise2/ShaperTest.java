package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class ShaperTest {

    @Test
    void shaperTest() {

        Shaper circleShaper = new CircleShaper();
        Assertions.assertEquals("Circle", circleShaper.getShape());

        Shaper squareShaper = new SquareShaper();
        Assertions.assertEquals("Square", squareShaper.getShape());

        Shaper triangleShaper = new TriangleShaper();
        Assertions.assertEquals("Triangle", triangleShaper.getShape());

        List<Shaper> shapers = List.of(circleShaper, squareShaper, triangleShaper);
        List<String> shaperNames = shapers.stream()
                .map(Shaper::getShape)
                .collect(Collectors.toList());
        List<String> expected = List.of("Circle", "Square", "Triangle");
        Assertions.assertEquals(expected, shaperNames);
    }

}
