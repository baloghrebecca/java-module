package academy.everyonecodes.java.week3.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileNameTest {

    FileName fileName = new FileName();

    @Test
    void generateName() {

        String oldName = "test.jpg";
        String result = fileName.generateName(oldName);
        String expected = "test.png";

        Assertions.assertEquals(expected, result);

    }

}
