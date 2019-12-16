package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        String name = "Curry";
        int numberOfMinutes = 30;
        List<String> ingredients = List.of("onions", "garlic", "carrots", "coconut milk");
        List<String> steps = List.of("roast onions and garlic", "put in the carrots", "add coconut milk");

        Recipe curry = new Recipe(name, numberOfMinutes, ingredients, steps);

    }

}
