package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;

public class RectangleShaper implements Shaper, Colored {


    @Override
    public String getShape() {
        return "Rectangle";
    }


    @Override
    public String getColor() {
        return "Green";
    }
}
