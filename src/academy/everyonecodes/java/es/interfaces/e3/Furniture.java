package academy.everyonecodes.java.es.interfaces.e3;

import java.util.ArrayList;
import java.util.List;

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
}
