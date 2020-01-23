package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.Optional;

public class HappinessDataParser {

    public Optional<HappinessRecord> parse(String countryData) {
        String[] countries = countryData.split(";");
        String country = countries[0];
        int rank = 0;
        double score = 0.0;
        try {
            rank = Integer.valueOf(countries[1]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty(); // we return an empty object, if an exception is thrown/caught.
        }
        try {
            score =  Double.valueOf(countries[2]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
        return Optional.of(new HappinessRecord(country, rank, score));
    }

}
