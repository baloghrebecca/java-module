package academy.everyonecodes.java.week8.set1.exercise4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroCallerTest {

    SuperheroCaller caller = new SuperheroCaller();

    private static Stream<Arguments> correctSuperHero() {
        return Stream.of(
                Arguments.of(new Batman(), "batman"),
                Arguments.of(new Spiderman(), "spiderman")
        );
    }

    @ParameterizedTest
    @MethodSource("correctSuperHero")
    void findSuperhero(Superhero expected, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);
        assertTrue(oResult.isPresent());
        assertEquals(expected.getSuperheroName(), oResult.get().getSuperheroName());
    }

    private static Stream<Arguments> returnsCorrectPrivateName() {
        return Stream.of(
                Arguments.of(new Superman(), "clark kent"),
                Arguments.of(new Spiderman(), "peter parker")
        );
    }

    @ParameterizedTest
    @MethodSource("returnsCorrectPrivateName")
    void findSuperheroWithPrivateName(Superhero expectedPrivateName, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);
        assertTrue(oResult.isPresent());
        assertEquals(expectedPrivateName.getSuperheroName(), oResult.get().getSuperheroName());
    }

    @Test
    void returnsEmptyOptionalForWrongKeyword(){
        Optional<Superhero> oResult = caller.findSuperhero("wonder woman");
        assertTrue(oResult.isEmpty());
    }

}