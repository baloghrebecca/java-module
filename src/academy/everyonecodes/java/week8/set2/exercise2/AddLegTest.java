package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AddLegTest {

    AddLeg addLeg = new AddLeg();

    @Test
    void addLegOne() {
        Furniture table = new Furniture("Table");
        List<String> expectedParts = List.of("Leg");
        addLeg.apply(table);
        Assertions.assertEquals(expectedParts, table.getParts());
    }

    @Test
    void addLegTwo() {
        Furniture table = new Furniture("Table");
        List<String> expectedParts = List.of("Leg", "Leg");
        addLeg.apply(table);
        addLeg.apply(table);
        Assertions.assertEquals(expectedParts, table.getParts());
    }

    @Test
    void addLegNo() {
        Furniture table = new Furniture("Table");
        List<String> expectedParts = List.of();
        Assertions.assertEquals(expectedParts, table.getParts());
    }

}