package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

class PokemonTop5Test {

    PokemonReader pokemonReader = new PokemonReader();
    PokemonTop5 pokemonTop5 = new PokemonTop5();

    @Test
    void comparePokemons() {
        List<Pokemon> pokemonList = pokemonReader.read();
        List<String> result = pokemonTop5.findTopFive(pokemonList).stream()
                .map(Pokemon::getName)
                .collect(Collectors.toList());
        List<String> expected = List.of("MewtwoMega Mewtwo X", "MewtwoMega Mewtwo Y", "RayquazaMega Rayquaza","KyogrePrimal Kyogre", "GroudonPrimal Groudon");
        Assertions.assertEquals(expected, result);
    }

}