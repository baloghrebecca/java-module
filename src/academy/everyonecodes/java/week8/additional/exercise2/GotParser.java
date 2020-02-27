package academy.everyonecodes.java.week8.additional.exercise2;

import java.util.List;
import java.util.Optional;

public class GotParser {

    public Character parseLine(String line) {
        List<String> gotList = List.of(line.split(";", -1));
        String characterName = gotList.get(0);
        Optional<Integer> bookOfDeath;
        if (gotList.get(3).length() == 1) {
            bookOfDeath = Optional.of(Integer.parseInt(gotList.get(3)));
        } else {
            bookOfDeath = Optional.empty();
        }

        String gender = "";
        if (gotList.get(6).equals("1")) {
            gender = "male";
        }
        if (gotList.get(6).equals("0")) {
            gender = "female";
        }

        String a = gotList.get(1);

        return new Character(characterName, a, bookOfDeath, gender);
    }


}
