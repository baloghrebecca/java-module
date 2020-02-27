package academy.everyonecodes.java.evaluation2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioDeviceTest {

    RadioDevice radioDevice = new RadioDevice();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("Hello World"), new RadioMessage("Hello World", 4200)),
                Arguments.of(Optional.empty(), new RadioMessage("Hello World", 4500)),
                Arguments.of(Optional.of("Hello"), new RadioMessage("Hello", 1900))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void receive(Optional<String> oExpected, RadioMessage radioMessage) {
        Optional<String> oResult = radioDevice.receive(radioMessage);
        assertEquals(oExpected, oResult);
    }
}