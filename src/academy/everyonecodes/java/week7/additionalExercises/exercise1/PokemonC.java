package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import java.util.Objects;

public class PokemonC {

    private String name;
    private int speed;

    public PokemonC(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonC pokemonC = (PokemonC) o;
        return speed == pokemonC.speed &&
                name.equals(pokemonC.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed);
    }

    @Override
    public String toString() {
        return "PokemonC{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
