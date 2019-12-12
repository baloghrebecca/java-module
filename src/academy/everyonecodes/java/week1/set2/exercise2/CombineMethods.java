package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.List;
import java.util.ArrayList;

public class CombineMethods {

    public static List<String> combine(List<String> animals, List<String> objects) {
        List<String> combinedElements = new ArrayList<>();
        int counter = 0;
        int animalSize = animals.size();
        int objectSize = objects.size();
        while ((counter < animalSize) || (counter < objectSize)) {
            if (counter < animalSize) {
                String animal = animals.get(counter);
                combinedElements.add(animal);
            }
            if (counter < objectSize) {

                String object = objects.get(counter);
                combinedElements.add(object);
            }

            counter++;
        }
        return combinedElements;
    }

    public static void main(String[] args) {
        List<String> animals = List.of("dog", "cat", "bird");
        List<String> objects = List.of("table", "chair", "lamp", "vase");
        List<String> combinedElements = combine(animals,objects);
        for (String element : combinedElements) {
            System.out.println(element);
        }
    }

}
