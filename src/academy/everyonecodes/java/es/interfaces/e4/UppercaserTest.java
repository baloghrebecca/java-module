package academy.everyonecodes.java.es.interfaces.e4;

import academy.everyonecodes.java.week9.set2.exercise2.Paper;
import academy.everyonecodes.java.week9.set2.exercise2.Rock;
import academy.everyonecodes.java.week9.set2.exercise2.Scissors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UppercaserTest {

    Uppercaser uppercaser = new Uppercaser();
    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("HELLO WORLD", new Phrase("hello world", "test")),
                Arguments.of("", new Phrase("", "m")),
                Arguments.of("HI", new Phrase("HI", "m"))
        );
    }

    @ParameterizedTest
   @MethodSource("parameters")
    void modify(String expected, Phrase input) {
        uppercaser.modify(input);
        Assertions.assertEquals(expected, input.getText());
    }
}