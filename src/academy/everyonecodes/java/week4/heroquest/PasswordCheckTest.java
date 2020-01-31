package academy.everyonecodes.java.week4.heroquest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PasswordCheckTest {

    PasswordCheck passwordCheck = new PasswordCheck();

   @ParameterizedTest
    @CsvSource({
            "false, hello*1",
            "false, hellobello0*",
            "true, Hellobello0*",
            "false, ' ',",
            "true, SuperSecret022#"
    })

    void checker(boolean expected, String password) {
       boolean result = passwordCheck.passwordChecker(password);
       Assertions.assertEquals(expected, result);
   }

}
