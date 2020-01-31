package academy.everyonecodes.java.week4.heroquest;

import java.util.List;

public class SpecialCharactersCheck {

    public boolean check(String password, List<String> specialCharacters) {


        for (String character : specialCharacters) {
            if (password.contains(character)) {
                return true;
            }
        }

        return false;

    }
}
