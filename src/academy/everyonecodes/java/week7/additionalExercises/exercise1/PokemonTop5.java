package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonTop5 {

    public List<Pokemon> findTopFive(List<Pokemon> pokemonList) {
        List<Pokemon> topFivePokemon = pokemonList.stream()
                .sorted(Comparator.comparing(Pokemon::getTotalScore).reversed())
                .limit(5)
                .collect(Collectors.toList());
        return topFivePokemon;
    }



}
