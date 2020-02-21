package academy.everyonecodes.java.week8.additional.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SmsParserTest {

    SmsParser smsParser = new SmsParser();

    private static Stream<Arguments> returnsCorrectObject() {
        return Stream.of(
                Arguments.of(new Sms("ham", "Ok lar... Joking wif u oni..."), "ham;Ok lar... Joking wif u oni...;;;"),
                Arguments.of(new Sms("ham", "Ffffffffff. Alright no way I can meet up with you sooner?"), "ham;Ffffffffff. Alright no way I can meet up with you sooner?;;;")
        );
    }

    @ParameterizedTest
    @MethodSource("returnsCorrectObject")
    void parser(Sms expected, String line) {
        Sms result = smsParser.parseLine(line);
        Assertions.assertEquals(expected, result);
    }


}