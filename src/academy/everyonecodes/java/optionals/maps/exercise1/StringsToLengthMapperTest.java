package academy.everyonecodes.java.optionals.maps.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class StringsToLengthMapperTest {
    StringsToLengthMapper stringsToLengthMapper = new StringsToLengthMapper();

    @ParameterizedTest
    @MethodSource("provideMaps")
    void map(Map<String, Integer> expected, List<String> input) {
        Map<String, Integer> result = stringsToLengthMapper.map(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideMaps() {
        List<String> strings = List.of("hi", "there");
        Map<String, Integer> emptyMap = new HashMap<>();
        Map<String, Integer> filledMap = new HashMap<>();
        filledMap.put("hi", 2);
        filledMap.put("there", 5);
        return Stream.of(
                Arguments.of(emptyMap, List.of()),
                Arguments.of(filledMap, strings)
        );
    }
}
