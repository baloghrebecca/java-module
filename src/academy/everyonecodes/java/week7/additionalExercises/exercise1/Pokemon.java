package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import java.util.Objects;
import java.util.Optional;

public class Pokemon {

    private String name;
    private String type1;
    private Optional<String> type2;
    private int totalScore;
    private int speed;
    private boolean isLegendary;

    public Pokemon(String name, String type1, Optional<String> type2, int totalScore, int speed, boolean isLegendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.totalScore = totalScore;
        this.speed = speed;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public Optional<String> getType2() {
        return type2;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return totalScore == pokemon.totalScore &&
                speed == pokemon.speed &&
                isLegendary == pokemon.isLegendary &&
                name.equals(pokemon.name) &&
                type1.equals(pokemon.type1) &&
                type2.equals(pokemon.type2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type1, type2, totalScore, speed, isLegendary);
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2=" + type2 +
                ", totalScore=" + totalScore +
                ", speed=" + speed +
                ", isLegendary=" + isLegendary +
                '}';
    }


}
