package academy.everyonecodes.java.evaluation1.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderTest {

    FileReader fileReader = new FileReader();

    @Test
    void readerWithSeveralItemsInTheList() {

        String file = "src/academy/everyonecodes/java/evaluation1/files/lines.txt";

        List<String> expected = List.of("line 1", "line 2", "line 3", "line 4", "line 5", "line 6", "line 7", "line 8", "line 9", "line 10");
        List<String> result = fileReader.read(file);
        Assertions.assertEquals(expected, result);

    }


}