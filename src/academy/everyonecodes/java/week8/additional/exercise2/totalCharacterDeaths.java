package academy.everyonecodes.java.week8.additional.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class totalCharacterDeaths {

    public int counterDeath(List<Character> characters) {
        List<Character> deadCharacters = characters.stream()
                .filter(e -> e.getBookOfDeath().isPresent())
                .collect(Collectors.toList());
        return deadCharacters.size();
    }

}
