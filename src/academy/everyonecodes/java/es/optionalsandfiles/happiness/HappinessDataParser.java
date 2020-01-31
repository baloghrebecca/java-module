package academy.everyonecodes.java.es.optionalsandfiles.happiness;

import java.util.List;
import java.util.Optional;

public class HappinessDataParser {

    public Optional<HappinessRecord> parse(String input) {
        List<String> inputIntoSeparateParts = List.of(input.split(";"));
        if (inputIntoSeparateParts.size() != 12) {
            return Optional.empty();
        }
        String country;
        int rank;
        double score;
        try {
            country = inputIntoSeparateParts.get(0);
            rank = Integer.parseInt(inputIntoSeparateParts.get(1));
            score = Double.parseDouble(inputIntoSeparateParts.get(2));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }

        return Optional.of(new HappinessRecord(country, rank, score));
    }

}
