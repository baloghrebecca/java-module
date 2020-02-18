package academy.everyonecodes.java.week9.set1.exercise1.animals;

import java.util.List;

public class Mammal extends Animal{

    private String hairColor;

    public Mammal(String name, List<String> movement, String hairColor) {
        super(name, movement, "mammal");
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
