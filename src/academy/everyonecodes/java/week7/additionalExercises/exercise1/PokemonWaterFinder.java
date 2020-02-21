package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import java.util.List;

public class PokemonWaterFinder {


    public long findWaterPokemon(List<Pokemon> pokemonList) {
        long waterPokemon = pokemonList.stream()
                .filter(data -> data.getType1().equals("Water") || data.getType2().isPresent() && data.getType2().get().equals("Water"))
                .count();
        return waterPokemon;
    }


}
