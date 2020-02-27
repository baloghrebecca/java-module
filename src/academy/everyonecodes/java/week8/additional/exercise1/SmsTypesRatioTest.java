package academy.everyonecodes.java.week8.additional.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmsTypesRatioTest {

    SmsTypesRatio smsTypesRatio = new SmsTypesRatio();

    @Test
    void correctRation() {
        String result = smsTypesRatio.ratio();
        String expected = "Ham/spam ratio: ham 86 spam 13";
        Assertions.assertEquals(expected, result);
    }

}