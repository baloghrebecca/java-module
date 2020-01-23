package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class ArtistFinderTest {

    ArtistFinder artistFinder = new ArtistFinder();

    @Test
    void findWithRightSongName() {
        Optional<String> oArtistName = artistFinder.findFor("Panini");
        Assertions.assertTrue(oArtistName.isPresent());
        Assertions.assertEquals("Lil Nas X", oArtistName.get());
    }

    @Test
    void findWithWrongSongName() {
        Optional<String> oArtistName = artistFinder.findFor("Any Song");
        Assertions.assertTrue(oArtistName.isEmpty());
    }


}