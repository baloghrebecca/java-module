package academy.everyonecodes.java.week9.set1.exercise1.animals;

import java.util.List;

public class Animal {

    private String name;
    private List<String> movement;
    private String animalKind;

    public Animal(String name, List<String> movement, String animalKind) {
        this.name = name;
        this.movement = movement;
        this.animalKind = animalKind;
    }

    public String getName() {
        return name;
    }

    public List<String> getMovement() {
        return movement;
    }

    public String getAnimalKind() {
        return animalKind;
    }

}
