package academy.everyonecodes.java.es.interfaces.e3;

import java.util.List;

public class TableBuilder {

    private List<BuildingStep> parts = List.of(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddSurface());

    public void build(Furniture furniture) {
         parts.stream()
                .forEach(e -> e.apply(furniture));
    }
}
