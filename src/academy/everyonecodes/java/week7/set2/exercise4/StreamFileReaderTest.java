package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class StreamFileReaderTest {

    StreamFileReader streamFileReader = new StreamFileReader();

    @Test
    void readerWithSeveralItemsInTheList() {

        String file = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";

        List<String> expected = List.of("Giraffe", "Lion", "Fish", "Tiger", "Snake", "Dog", "Horse", "Cat", "Snail", "Mouse");
        List<String> result = streamFileReader.readLines(file)
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, result);
    }
}
