package academy.everyonecodes.java.week4.heroquest;

import java.util.List;

public class SpecialCharactersRemover {

    public String remover(String password, List<String> specialCharacters) {

        for (String character : specialCharacters) {
            if (password.contains(character)) {
                password = password.replace(character, "");
            }
        }

        return password;

    }
    }
