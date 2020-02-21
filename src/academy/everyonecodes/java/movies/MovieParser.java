package academy.everyonecodes.java.movies;

import java.util.List;

public class MovieParser {

    public Movie movieParser(String line) {
        List<String> splitLine = List.of(line.split(";"));
        return new Movie(
                splitLine.get(0),
                splitLine.get(1),
                Boolean.valueOf(splitLine.get(2))
        );

    }


}
