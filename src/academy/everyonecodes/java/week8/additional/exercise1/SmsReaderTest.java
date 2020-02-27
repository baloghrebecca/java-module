package academy.everyonecodes.java.week8.additional.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmsReaderTest {

    SmsReader smsReader = new SmsReader();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(new Sms("ham", "Go until jurong point, crazy.. Available only in bugis n great world la e buffet... Cine there got amore wat...")))
                //Arguments.of(0, new BeginnerThief(), new Safe(0, "open"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void read(List<Sms> expected) {
        List<Sms> result1 = smsReader.reader();
        List<Sms> result = List.of(result1.get(0));
        System.out.println(result.get(0));
        assertEquals(expected, result);
    }


}