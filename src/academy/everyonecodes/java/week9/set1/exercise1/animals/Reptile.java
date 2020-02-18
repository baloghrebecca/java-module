package academy.everyonecodes.java.week9.set1.exercise1.animals;

import java.util.List;

public class Reptile extends Animal{

    private boolean hasShell;

    public Reptile(String name, List<String> movement, boolean hasShell) {
        super(name, movement, "reptile");
        this.hasShell = hasShell;
    }

    public boolean isHasShell() {
        return hasShell;
    }
}
