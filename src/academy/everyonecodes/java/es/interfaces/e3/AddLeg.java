package academy.everyonecodes.java.es.interfaces.e3;

public class AddLeg implements BuildingStep {


    @Override
    public void apply(Furniture furniture) {
        furniture.getParts().add("Leg");
    }
}
