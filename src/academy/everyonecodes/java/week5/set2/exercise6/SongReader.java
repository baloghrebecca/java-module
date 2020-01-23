package academy.everyonecodes.java.week5.set2.exercise6;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SongReader {

    public Optional<List<Song>> read() {
        SpotifyDataParser spotifyDataParser = new SpotifyDataParser();

        String file = "src/academy/everyonecodes/java/week5/set2/files/spotify-top-50.csv";
        Path path = Path.of(file);
        List<String> songs;
        try {
            songs = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
        Optional<List<Song>> songsObjects = Optional.of(new ArrayList<>());
        for (String song : songs) {
            Optional<Song> oSong = spotifyDataParser.parseLine(song);
            if (oSong.isPresent()) {
                songsObjects.get().add(oSong.get());
            }
        }
        return songsObjects;
    }

}
