package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class HappinessDataParserTest {

    HappinessDataParser happinessDataParser = new HappinessDataParser();

    @Test
    void parserWithNoException() {
       String input = "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917";
       HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
       Optional<HappinessRecord> oResult = happinessDataParser.parse(input);
       Assertions.assertTrue(oResult.isPresent());
       Assertions.assertEquals(expected.getCountry(), oResult.get().getCountry());
       Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
       Assertions.assertEquals(expected.getScore(), oResult.get().getScore());
    }

    @Test
    void parserWithNumberFormatExceptionInteger() {
        String input = "Lesotho;139points;3.80800008773804;4.04434397548437;3.5716561999917";
        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        Optional<HappinessRecord> oResult = happinessDataParser.parse(input);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void parserWithNumberFormatExceptionDouble() {
        String input = "Lesotho;139;3.80800008773804score;4.04434397548437;3.5716561999917";
        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        Optional<HappinessRecord> oResult = happinessDataParser.parse(input);
        Assertions.assertTrue(oResult.isEmpty());
    }


}