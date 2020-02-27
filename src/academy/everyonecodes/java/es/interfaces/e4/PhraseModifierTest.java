package academy.everyonecodes.java.es.interfaces.e4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PhraseModifierTest {

    PhraseModifier phraseModifier = new PhraseModifier();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("H E L L O W O R L D", new Phrase("hello world", "test"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void modify(String expected, Phrase input) {
        phraseModifier.modified(input);
        Assertions.assertEquals(expected, input.getText());
    }
}