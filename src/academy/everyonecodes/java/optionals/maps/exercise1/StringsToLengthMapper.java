package academy.everyonecodes.java.optionals.maps.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringsToLengthMapper {

    public Map<String, Integer> map(List<String> input) {
        Map<String, Integer> map = new HashMap<>();
        input.forEach(word -> map.put(word, word.length()));
        return map;
    }

}
