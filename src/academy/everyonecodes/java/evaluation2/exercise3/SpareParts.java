package academy.everyonecodes.java.evaluation2.exercise3;

public class SpareParts extends MysteryBox {

    public SpareParts(int intensity) {
        super(intensity);
    }

    @Override
    void apply(Spaceship spaceship) {
        int healthModified = spaceship.getHealth() + getIntensity();
        spaceship.setHealth(healthModified);
    }
}
