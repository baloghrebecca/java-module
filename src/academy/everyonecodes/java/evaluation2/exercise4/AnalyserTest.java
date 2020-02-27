package academy.everyonecodes.java.evaluation2.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnalyserTest {

    static AvocadoEntryReader reader = new AvocadoEntryReader();
    Analyser analyser = new Analyser();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        List.of("Lowest average price is: Result not found",
                                "Region of most sold organic is: Result not found"),
                        List.of()),
                Arguments.of(
                        List.of("Lowest average price is: 0.44 on 2017",
                                "Region of most sold organic is: Northeast with 793464.77"),
                        reader.read()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void analyse(List<String> expected, List<AvocadoEntry> entries) {
        List<String> result = analyser.analyse(entries);
        assertEquals(expected, result);
    }
}