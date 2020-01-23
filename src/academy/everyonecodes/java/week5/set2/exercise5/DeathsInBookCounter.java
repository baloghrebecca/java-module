package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class DeathsInBookCounter {

    public int count(List<Character> characterList, int bookNumber) {
        int result = 0; //test it with 0
        for (Character character : characterList) {
            if (character.getBookOfDeath().equals(Optional.of((String.valueOf(bookNumber))))) { //here we make the String "bookNumber" an Optional to be able to compare it to the String of bookOfDeath
                result++;
            }
        }
        return result;
    }



}
