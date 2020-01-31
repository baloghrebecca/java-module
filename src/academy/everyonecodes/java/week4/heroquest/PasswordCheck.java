package academy.everyonecodes.java.week4.heroquest;

import java.util.List;

public class PasswordCheck {


    public boolean passwordChecker(String password) {
        SpecialCharactersCheck specialCharactersCheck = new SpecialCharactersCheck();
        SpecialCharactersRemover specialCharactersRemover = new SpecialCharactersRemover();
        String passwordLowerCase = password.toLowerCase();
        String updatedPassword = "";
        List<String> specialCharacters = List.of("*", "/", ".", "+", "-", "#", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        boolean isValid = specialCharactersCheck.check(password, specialCharacters);
        if (isValid) {
            updatedPassword = specialCharactersRemover.remover(password, specialCharacters);
        } else {
            return false;
        }

        int passwordLength = updatedPassword.length();

        if (passwordLength < 7) {
            return false;
        }

        if (password.equals(passwordLowerCase)) {
            return false;
        }

        return true;
    }
}