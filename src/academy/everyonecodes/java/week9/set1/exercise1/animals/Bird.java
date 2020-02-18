package academy.everyonecodes.java.week9.set1.exercise1.animals;

import java.util.List;

public class Bird extends Animal {

    private String featherColor;

    public Bird(String name, List<String> movement, String featherColor) {
        super(name, movement, "bird");
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

}
