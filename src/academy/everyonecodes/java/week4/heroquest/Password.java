package academy.everyonecodes.java.week4.heroquest;

import java.util.List;

public class Password {

    private String password;
    private boolean isValid;

    public Password(String password, boolean isValid) {
        this.password = password;
        this.isValid = isValid;
    }

    public String getPassword() {
        return password;
    }

    public boolean isValid() {
        return isValid;
    }


}
