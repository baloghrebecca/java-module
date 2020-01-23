package academy.everyonecodes.java.week5.set2.exercise6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class SongReaderTest {

    SongReader songReader = new SongReader();

    @Test
    void readerWithoutFirstRow() {
        Optional<Song> oSongOne = Optional.of(new Song("Señorita", 1, "Shawn Mendes"));
        Optional<List<Song>> oResult = songReader.read();
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(oSongOne.get().getSongArtist(), oResult.get().get(0).getSongArtist());
    }

    @Test
    void readerRightSize() {
        Optional<List<Song>> oResult = songReader.read();
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(50,oResult.get().size());
    }

    @Test
    void readerLastLine() {
        Optional<Song> oSongOne = Optional.of(new Song("Cross Me (feat. Chance the Rapper & PnB Rock)", 50, "Ed Sheeran"));
        Optional<List<Song>> oResult = songReader.read();
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(oSongOne.get().getSongArtist(), oResult.get().get(49).getSongArtist());
    }




}