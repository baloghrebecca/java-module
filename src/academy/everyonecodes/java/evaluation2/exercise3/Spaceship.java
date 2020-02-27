package academy.everyonecodes.java.evaluation2.exercise3;

import java.util.Objects;

public class Spaceship {

    private int health;
    private int damage;

    public Spaceship(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spaceship spaceship = (Spaceship) o;
        return health == spaceship.health &&
                damage == spaceship.damage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, damage);
    }
}
