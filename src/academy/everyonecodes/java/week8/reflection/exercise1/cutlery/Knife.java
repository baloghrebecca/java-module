package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Knife implements Cutlery{

    private List<String> dishesForKnives = List.of("Pizza", "Fish");

    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return dishesForKnives.stream()
                .anyMatch(e -> e.equalsIgnoreCase(dishName));
    }
}
