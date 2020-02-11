package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ShaperColorTest {

    @Test
    void shapeColorTester() {

        RectangleShaper rectangleShaper = new RectangleShaper();
        Assertions.assertEquals("Rectangle", rectangleShaper.getShape());
        Assertions.assertEquals("Green", rectangleShaper.getColor());

        Colored colored = (Colored) rectangleShaper;
        Assertions.assertEquals("Green", colored.getColor());

        Shaper shaper = (Shaper) rectangleShaper;
        Assertions.assertEquals("Rectangle", shaper.getShape());

        List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);
        // List<Colored> coloreds = List.of(rectangleShaper, colored, shaper); -> not working,because shaper doesn't have the colored property

        List<Shaper> shapes = List.of(rectangleShaper, shaper);



    }



}
