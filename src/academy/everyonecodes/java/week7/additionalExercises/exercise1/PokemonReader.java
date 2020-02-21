package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PokemonReader {

    private PokemonDataParser pokemonDataParser = new PokemonDataParser();
    private String file = "src/academy/everyonecodes/java/week7/additionalExercises/files/pokemon.csv";

    public List<Pokemon> read() {
        Path path = Path.of(file);
        List<Pokemon> pokemonList;
        try {
            pokemonList = Files.lines(path)
                    .skip(1)
                    .map(line -> pokemonDataParser.parseLine(line))
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return pokemonList;
    }
}
