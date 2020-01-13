package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringSecondHalfPickerTest {

    StringSecondHalfPicker stringSecondHalfPicker = new StringSecondHalfPicker();

    @Test
    void picker() {
        List<String> names = List.of("Rebecca", "Agata", "Andrea", "David", "Thomas");
        List<String> namesCorrect = List.of("Andrea", "David", "Thomas");

        String result = stringSecondHalfPicker.pick(names);
        System.out.println(result);
        Assertions.assertTrue(namesCorrect.contains(result));
    }

    @Test
    void picker2() {
        List<String> names = List.of("Rebecca", "Agata", "Olena", "Andrea", "David", "Thomas");
        List<String> namesCorrect = List.of("Andrea", "David", "Thomas");

        String result = stringSecondHalfPicker.pick(names);
        System.out.println(result);
        Assertions.assertTrue(namesCorrect.contains(result));
    }


}



