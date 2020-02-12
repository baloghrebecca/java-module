package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TableBuilderTest {
    TableBuilder tableBuilder = new TableBuilder();

    @Test
    void build() {
        Furniture expected = new Furniture("Table");
        List<String> expectedParts = List.of("Leg", "Leg", "Leg", "Leg", "Surface");
        Furniture result = tableBuilder.build();
        Assertions.assertEquals(expectedParts, result.getParts());
    }
}