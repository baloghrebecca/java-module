package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class TotalDeathCounter {

    public int count(List<Character> characterList) {
        int result = 0; //test it with 0
        for (Character character : characterList) {
            if (!character.getBookOfDeath().equals(Optional.of(""))) {
                result++;
            }
        }
        return result;
    }
}
