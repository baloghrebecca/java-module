package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataParserTest {

    SpotifyDataParser spotifyDataParser = new SpotifyDataParser();

    @Test
    void parserWithoutExceptions() {
        String lineToParse = "1;\"Señorita\";\"Shawn Mendes\";\"canadian pop\";117;55;76;-6;8;75;191;4;3;79";
        Optional<Song> oExpected = Optional.of(new Song("Señorita", 1, "Shawn Mendes"));
        Optional<Song> oResult = spotifyDataParser.parseLine(lineToParse);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(oExpected.get().getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(oExpected.get().getRank(), oResult.get().getRank());
        Assertions.assertEquals(oExpected.get().getSongArtist(), oResult.get().getSongArtist());
    }

    @Test
    void parserWithoutExceptionsTwo() {
        String lineToParse = "";
        Optional<Song> oResult = spotifyDataParser.parseLine(lineToParse);
        Assertions.assertTrue(oResult.isEmpty());
    }


    @Test
    void parserWithCorrectInput() {
        String lineToParse = "1song;\"Señorita\";\"Shawn Mendes\";\"canadian pop\";117;55;76;-6;8;75;191;4;3;79";
        Optional<Song> oResult = spotifyDataParser.parseLine(lineToParse);
        Assertions.assertTrue(oResult.isEmpty());
    }


}