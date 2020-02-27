package academy.everyonecodes.java.evaluation2.exercise3;

public class WeaponsUpgrade extends MysteryBox {

    public WeaponsUpgrade(int intensity) {
        super(intensity);
    }

    @Override
    void apply(Spaceship spaceship) {
        int damageModified = spaceship.getDamage() + getIntensity();
        spaceship.setDamage(damageModified);
    }
}
