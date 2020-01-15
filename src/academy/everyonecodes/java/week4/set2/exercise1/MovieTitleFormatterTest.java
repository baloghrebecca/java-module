package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MovieTitleFormatterTest {

    MovieTitleFormatter movieTitleFormatter = new MovieTitleFormatter();

    @ParameterizedTest
    @CsvSource({
            "Harry Potter, harry potter", "Harry Potter And The Goblet Of Fire, harry potter and the goblet of fire", "Peter Pan, ' peter pan   '"
    })

    void format(String expected, String movieTitle) {

        String result = movieTitleFormatter.format(movieTitle);
        Assertions.assertEquals(expected, result);

    }

}
