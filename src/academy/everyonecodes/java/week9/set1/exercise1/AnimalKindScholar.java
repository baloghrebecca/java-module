package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animal;

import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalKindScholar {


    public Optional<String> elaborate(String keyword) {

        Optional<String> animalKind = Animals.get().stream()
                .filter(a -> a.getName().equalsIgnoreCase(keyword))
                .map(Animal::getAnimalKind)
                .findFirst();

        if (animalKind.isPresent()) {
            return animalKind;
        }

        String animalNames = Animals.get().stream()
                .filter(a -> a.getAnimalKind().equalsIgnoreCase(keyword))
                .map(Animal::getName)
                .sorted()
                .collect(Collectors.joining(", "));

        if (animalNames.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(animalNames);

    }
}

