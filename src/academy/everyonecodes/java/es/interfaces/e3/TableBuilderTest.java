package academy.everyonecodes.java.es.interfaces.e3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TableBuilderTest {

    TableBuilder tableBuilder = new TableBuilder();

    @Test
    void builder() {
        Furniture table = new Furniture("table");
        List<String> expected = List.of("Leg", "Leg", "Leg", "Leg", "Surface");
        tableBuilder.build(table);
        Assertions.assertEquals(expected, table.getParts());
    }

}