package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class PokemonDataParserTest {

    PokemonDataParser pokemonDataParser = new PokemonDataParser();

    @Test
    void testWithoutExceptions() {
        String line = "1,Bulbasaur,Grass,Poison,318,45,49,49,65,65,45,1,False";
        Optional<Pokemon> oResult = pokemonDataParser.parseLine(line);
        Pokemon expected = new Pokemon("Bulbasaur", "Grass", Optional.of("Poison"), 318, 45, false);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void testWithEmptyType2() {
        String line = "1,Bulbasaur,Grass,,318,45,49,49,65,65,45,1,False";
        Optional<Pokemon> oResult = pokemonDataParser.parseLine(line);
        Pokemon expected = new Pokemon("Bulbasaur", "Grass", Optional.empty(), 318, 45, false);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void testWithExeptions() {
        String line = "1,Bulbasaur,Grass,,31g8,45,49,49,65,65,45,1,False";
        Optional<Pokemon> oResult = pokemonDataParser.parseLine(line);
        Pokemon expected = new Pokemon("Bulbasaur", "Grass", Optional.empty(), 318, 45, false);
        Assertions.assertTrue(oResult.isEmpty());
    }

}