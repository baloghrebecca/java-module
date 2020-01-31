package academy.everyonecodes.java.es.e1;

import academy.everyonecodes.java.evaluation1.tools.FileReader;

import java.util.List;

public class AnimalCounter {

    private String file = "src/academy/everyonecodes/java/es/e1/files/animals.txt";
    private FileReader fileReader = new FileReader();

    public int counter() {
        List<String> animals = fileReader.read(file);
        return animals.size();
    }
}
