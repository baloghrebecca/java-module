package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Furniture {

    private String name;
    private List<String> parts;

    public Furniture(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Objects.equals(name, furniture.name) &&
                Objects.equals(parts, furniture.parts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parts);
    }
}
