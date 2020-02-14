package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Fork implements Cutlery {

    private List<String> dishesForForks = List.of("Fish", "Pizza", "Pasta");

    @Override
    public String getName() {
        return "Fork";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return dishesForForks.stream()
                .anyMatch(e -> e.equalsIgnoreCase(dishName));
    }
}
