package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PokemonWaterFinderTest {

    PokemonWaterFinder pokemonWaterFinder = new PokemonWaterFinder();
    PokemonReader pokemonReader = new PokemonReader();

    @Test
    void waterPokemonCount() {
        List<Pokemon> pokemonList = pokemonReader.read();
        long result = pokemonWaterFinder.findWaterPokemon(pokemonList);
        Assertions.assertEquals(126, result);
    }


}