package academy.everyonecodes.java.week6.set2.exercise3;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TemplateChooserTest {

    TemplateChooser templateChooser = new TemplateChooser();

    @ParameterizedTest
    @CsvSource({
        "female, Ms. Andrea Ramirez",
        "male, Mr. David Wang",
        "priviledged, Mr. Michi Hokopoko",
        "default, Rebecca Balogh"
    })

    void chooser(String expected, String name) {
        String result = templateChooser.choose(name);
    }



}