package academy.everyonecodes.java.es.optionalsandfiles.happiness;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HappinessDataParserTest {

    HappinessDataParser happinessDataParser = new HappinessDataParser();

    @Test
    void parserWithCorrectInput() {
        String input = "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904";
        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        Optional<HappinessRecord> oResult = happinessDataParser.parse(input);
        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }

    @Test
    void parserWithoutCorrectInput() {
        String input = "Lesotho;wrong;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904";
        Optional<HappinessRecord> oResult = happinessDataParser.parse(input);
        assertTrue(oResult.isEmpty());
    }

    @Test
    void parserWithoutSemiColumn() {
        String input = "Lesotho1233.808000087738044.044343975484373.57165619999170.5210212469100951.1900951862335200.3906612992286680.1574972718954090.1190946400165561.42983531951904";
        Optional<HappinessRecord> oResult = happinessDataParser.parse(input);
        assertTrue(oResult.isEmpty());
    }

    private void assertEquals(HappinessRecord expected, HappinessRecord first) {
        Assertions.assertEquals(expected.getCountry(), first.getCountry());
        Assertions.assertEquals(expected.getRank(), first.getRank());
        Assertions.assertEquals(expected.getScore(), first.getScore());
    }

}