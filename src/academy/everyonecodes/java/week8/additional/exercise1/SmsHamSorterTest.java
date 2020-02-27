package academy.everyonecodes.java.week8.additional.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmsHamSorterTest {

    SmsReader smsReader = new SmsReader();
    SmsHamSorter smsHamSorter = new SmsHamSorter();
    List<Sms> sms = smsReader.reader();

    @Test
    void sort() {
        List<Sms> sms = smsReader.reader();
        List<Sms> result = smsHamSorter.sort(sms);
        Assertions.assertEquals(4853, result.size());
    }
}