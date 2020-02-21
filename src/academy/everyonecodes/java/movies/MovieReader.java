package academy.everyonecodes.java.movies;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class MovieReader {

    FileReader fileReader = new FileReader();
    MovieParser parser = new MovieParser();
    private String file = "...";

    public List<Movie> reader() {
            return  fileReader.read(file).stream()
                    .map(line -> parser.movieParser(line))
                    .collect(Collectors.toList());
    }
}
