package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {


    public Optional<Song> parseLine(String songInfo) {
        if (songInfo.length() == 0) {
            return Optional.empty();
        }
        String[] song = songInfo.split(";");
        int rank;
        String artistName = song[2];
        String artistNameSongWithoutQuotationMarks = artistName.substring(1, artistName.length()-1);
        String songName = song[1];
        String songNameWithoutQuotationMarks = songName.substring(1, songName.length()-1);

        try {
            rank = Integer.parseInt(song[0]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
        return Optional.of(new Song(songNameWithoutQuotationMarks, rank, artistNameSongWithoutQuotationMarks));
    }

}
