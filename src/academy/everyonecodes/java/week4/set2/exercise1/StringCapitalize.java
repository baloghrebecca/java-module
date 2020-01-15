package academy.everyonecodes.java.week4.set2.exercise1;

public class StringCapitalize {

    public String capitalize(String word) {
        word = word.trim();
        word = word.substring(0,1).toUpperCase() + word.substring(1);
        return word;

    }


}
