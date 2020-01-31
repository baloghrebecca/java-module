package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week4.set2.exercise2.StringAsIntegerListParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegersParserTest {

    StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

    @Test
    void parserWithCorrectInput() {
        String input = "1;2;3;4";
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = stringAsIntegerListParser.parser(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void parserWithoutSemicolumn() {
        String input = "2892";
        List<Integer> expected = List.of(2892);
        List<Integer> result = stringAsIntegerListParser.parser(input);
        Assertions.assertEquals(expected, result);
    }



}