package academy.everyonecodes.java.es.interfaces.e4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SpacerTest {

    Spacer spacer = new Spacer();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("h e l l o w o r l d", new Phrase("hello world", "test"))
            //    Arguments.of("", new Phrase("", "m")),
              //  Arguments.of("HI", new Phrase("HI", "m"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void modify(String expected, Phrase input) {
        spacer.modify(input);
        Assertions.assertEquals(expected, input.getText());
    }

}