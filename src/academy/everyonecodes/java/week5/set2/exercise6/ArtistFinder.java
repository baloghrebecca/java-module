package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.List;
import java.util.Optional;

public class ArtistFinder {

    public Optional<String> findFor(String song) {
        SongReader songReader = new SongReader();
        Optional<List<Song>> allSongs = songReader.read();
        if (allSongs.isPresent()) { //always include the is present if you get an object out of the box
            for (Song currentSong : allSongs.get()) {
                if (currentSong.getTitle().equals(song)) {
                    return Optional.of(currentSong.getSongArtist());
                }
            }
        }
        return Optional.empty();
    }
}
