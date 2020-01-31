package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PictureNameExtractorTest {

    PictureNameExtractor pictureNameExtractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({
            "sunshine ,01222013SunshinePic.jpg",
            "dereks birthday, 01082003Dereks-BirthdayPic.jpg",
            "test birthday present, 01082003Test-Birthday-PresentPic.jpg",
            "'', 01222013Pic.jpg",
            "picnic, 01222013PicnicPic.jpg"
    })

    void extractWithNoExceptions(String expected, String input) {
        String result = pictureNameExtractor.extract(input);
        assertEquals(expected, result);
    }
}