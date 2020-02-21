package academy.everyonecodes.java.week7.additionalExercises.exercise1;

import java.util.List;
import java.util.Optional;

public class PokemonDataParser {

    public Optional<Pokemon> parseLine(String line) {
        List<String> splitLine = List.of(line.split(","));
        String name = splitLine.get(1);
        String type1 = splitLine.get(2);
        Optional<String> type2 = Optional.of(splitLine.get(3));
        if (splitLine.get(3).isBlank()) {
            type2 = Optional.empty();
        }

        try {
            int totalScore = Integer.parseInt(splitLine.get(4));
            int speed = Integer.parseInt(splitLine.get(10));
            boolean isLegendary = Boolean.parseBoolean(splitLine.get(12).toLowerCase());
            return Optional.of(new Pokemon(name, type1, type2, totalScore, speed, isLegendary));

        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }

    }

}
