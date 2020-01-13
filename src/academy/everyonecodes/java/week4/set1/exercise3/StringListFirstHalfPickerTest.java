package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringListFirstHalfPickerTest {

    StringListFirstHalfPicker stringListFirstHalfPicker = new StringListFirstHalfPicker();

    @Test
    void picker() {
        List<String> names = List.of("Rebecca", "Agata", "Andrea", "David", "Thomas");
        List<String> namesCorrect = List.of("Rebecca", "Agata");

        String result = stringListFirstHalfPicker.pick(names);
        Assertions.assertTrue(namesCorrect.contains(result));
    }




    }


