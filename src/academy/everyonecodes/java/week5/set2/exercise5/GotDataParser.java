package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class GotDataParser {

    public Character parse(String gotData) {
        List<String> gotList = List.of(gotData.split(";", -1));
        String characterName = gotList.get(0);
        Optional<String> bookOfDeath;
        if (gotList.get(3).length() == 1) {
            bookOfDeath = Optional.of(gotList.get(3));
        } else {
            bookOfDeath = Optional.of("");
        }

        String gender = "";
        if (gotList.get(6).equals("1")) {
            gender = "male";
        }
        if (gotList.get(6).equals("0")) {
            gender = "female";
        }
        return new Character(characterName, bookOfDeath, gender);
    }
}
