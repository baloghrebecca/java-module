package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

public class Spoon implements Cutlery {

    @Override
    public String getName() {
        return "Spoon";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return dishName.equalsIgnoreCase("soup");
    }
}
