package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Recipe {

    private String name;
    private int numberOfMinutes;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(String name, int numberOfMinutes, List<String> ingredients, List<String> steps) {
        this.name = name;
        this.numberOfMinutes = numberOfMinutes;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }


    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }


    public List<String> getIngredients() {
        return ingredients;
    }


    public List<String> getSteps() {
        return steps;
    }

}
