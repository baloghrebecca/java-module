package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class TableBuilder {

    private List<BuildingStep> steps = List.of(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddSurface());

    public Furniture build() {
       Furniture table = new Furniture("Table");
       steps.stream()
                .forEach(step -> step.apply(table));
        return table;
    }
}
