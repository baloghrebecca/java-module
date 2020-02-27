package academy.everyonecodes.java.es.interfaces.e3;

public class AddSurface implements BuildingStep {
    @Override
    public void apply(Furniture furniture) {
        furniture.getParts().add("Surface");
    }
}
