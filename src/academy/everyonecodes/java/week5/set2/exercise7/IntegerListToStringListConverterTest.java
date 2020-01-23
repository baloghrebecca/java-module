package academy.everyonecodes.java.week5.set2.exercise7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegerListToStringListConverterTest {

    IntegerListToStringListConverter integerListToStringListConverter = new IntegerListToStringListConverter();

    @Test
    void convertFirstLengthSame() {
        List<String> stringsLengthsResult = integerListToStringListConverter.convert();
        Assertions.assertEquals("86", stringsLengthsResult.get(0));
    }

    @Test
    void convertLastLengthSame() {
        List<String> stringsLengthsResult = integerListToStringListConverter.convert();
        Assertions.assertEquals("66", stringsLengthsResult.get(119));
    }

    @Test
    void convertAndCheckForSize() {
        List<String> stringsLengthsResult = integerListToStringListConverter.convert();
        Assertions.assertEquals(120, stringsLengthsResult.size());
    }


}