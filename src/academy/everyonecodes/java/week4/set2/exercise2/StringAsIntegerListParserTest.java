package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringAsIntegerListParserTest {

    StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

    @Test
    void parser() {

        String number = "1;2;3;4";
        List<Integer> expected = List.of(1,2,3,4);
        List<Integer> parsedNumbers = stringAsIntegerListParser.parser(number);
        Assertions.assertEquals(expected, parsedNumbers);

    }

    @Test
    void parserWithOneNumber() {

        String number = "1";
        List<Integer> expected = List.of(1);
        List<Integer> parsedNumbers = stringAsIntegerListParser.parser(number);
        Assertions.assertEquals(expected, parsedNumbers);

    }

    @Test
    void parserWithZero() {

        String number = "1;0;0";
        List<Integer> expected = List.of(1, 0, 0);
        List<Integer> parsedNumbers = stringAsIntegerListParser.parser(number);
        Assertions.assertEquals(expected, parsedNumbers);

    }


}
