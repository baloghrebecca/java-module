package academy.everyonecodes.java.week9.set1.exercise1.animals;

import java.util.List;

public class Fish extends Animal {

    private String waterKind;

    public Fish(String name, List<String> movement, String waterKind) {
        super(name, movement, "fish");
        this.waterKind = waterKind;
    }

    public String getWaterKind() {
        return waterKind;
    }
}
