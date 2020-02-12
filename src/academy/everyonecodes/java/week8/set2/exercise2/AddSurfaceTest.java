package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AddSurfaceTest {

    AddSurface addSurface = new AddSurface();

    @Test
    void addOneSurface() {
        Furniture table = new Furniture("Table");
        List<String> expectedParts = List.of("Surface");
        addSurface.apply(table);
        Assertions.assertEquals(expectedParts, table.getParts());
    }

    @Test
    void addTwoSurfaces() {
        Furniture table = new Furniture("Table");
        List<String> expectedParts = List.of("Surface", "Surface");
        addSurface.apply(table);
        addSurface.apply(table);
        Assertions.assertEquals(expectedParts, table.getParts());
    }

    @Test
    void addNoSurfaces() {
        Furniture table = new Furniture("Table");
        List<String> expectedParts = List.of();
        Assertions.assertEquals(expectedParts, table.getParts());
    }
}