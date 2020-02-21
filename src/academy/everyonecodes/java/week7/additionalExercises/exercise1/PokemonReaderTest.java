package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class PokemonReaderTest {

    PokemonReader pokemonReader = new PokemonReader();

    @Test
    void readerFirstLineRight() {
        List<Pokemon> pokemonList = pokemonReader.read();
        Pokemon expected = new Pokemon("Bulbasaur", "Grass", Optional.of("Poison"), 318, 45, false);
        Assertions.assertEquals(expected, pokemonList.get(0));
    }

    @Test
    void readerLastLineRight() {
        List<Pokemon> pokemonList = pokemonReader.read();
        Pokemon expected = new Pokemon("Volcanion", "Fire", Optional.of("Water"), 600, 70, true);
        Assertions.assertEquals(expected, pokemonList.get(pokemonList.size()-1));
    }

    @Test
    void readerSizeRight() {
        List<Pokemon> pokemonList = pokemonReader.read();
        Assertions.assertEquals(800, pokemonList.size());
    }


}