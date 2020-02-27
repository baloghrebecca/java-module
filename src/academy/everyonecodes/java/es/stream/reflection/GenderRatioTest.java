package academy.everyonecodes.java.es.stream.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenderRatioTest {

    GenderRatio genderRatio = new GenderRatio();
    StudentPerformanceReader studentPerformanceReader = new StudentPerformanceReader();

    @Test
    void ratio() {
        List<StudentPerformance> students = studentPerformanceReader.read();
        String result = genderRatio.ratio(students);
        Assertions.assertEquals("Gender ratio format: 518:482", result);

    }
}