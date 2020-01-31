package academy.everyonecodes.java.es.stringmethods.e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RandomFileNamePickerTest {

    RandomFileNamePicker randomFileNamePicker = new RandomFileNamePicker();

    @Test
    void pickerIncludingTheFilename() {
        List<String> fileNames = List.of("PHOTO_10012020.png",
                "PHOTO_24122019.png",
                "PHOTO_03042001.png");

        String randomFile = randomFileNamePicker.pick(fileNames);
        Assertions.assertTrue(fileNames.contains(randomFile));
        System.out.println(randomFile);
    }

}