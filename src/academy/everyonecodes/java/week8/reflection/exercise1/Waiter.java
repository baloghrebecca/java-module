package academy.everyonecodes.java.week8.reflection.exercise1;

import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Cutlery;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Fork;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Knife;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Spoon;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Waiter {

    private List<Cutlery> cutleryList = List.of(new Spoon(), new Fork(), new Knife());

    public List<String> getCutlery(String dish) {
        return cutleryList.stream()
                .filter(isCutleryUsedForDish(dish))
                .map(Cutlery::getName)
                .collect(Collectors.toList());
    }

    private Predicate<Cutlery> isCutleryUsedForDish(String dish) {
        return cutlery -> cutlery.isUsedFor(dish);
    }
}
