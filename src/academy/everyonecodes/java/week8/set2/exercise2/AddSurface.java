package academy.everyonecodes.java.week8.set2.exercise2;

public class AddSurface implements BuildingStep{

    @Override
    public void apply(Furniture furniture) {
        furniture.getParts().add("Surface");
    }
}
