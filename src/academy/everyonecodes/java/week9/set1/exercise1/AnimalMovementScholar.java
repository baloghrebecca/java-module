package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animal;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalMovementScholar {

    public Optional<String> elaborate(String keyword) {

        List<String> animalMovement = Animals.get().stream()
                .filter(a -> a.getName().equalsIgnoreCase(keyword))
                .map(Animal::getMovement)
                //here we make a Stream out of the List<String>:
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());

        if (!animalMovement.isEmpty()) {
            String animalMovementIntoString = String.join(", ", animalMovement);
            return Optional.of(animalMovementIntoString);
        }


        List<String> animalMovements = Animals.get().stream()
                .filter(a -> a.getAnimalKind().equalsIgnoreCase(keyword))
                .map(Animal::getMovement)
                .flatMap(Collection::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        if (!animalMovements.isEmpty()) {
            String animalMovementsIntoString = String.join(", ", animalMovements);
            return Optional.of(animalMovementsIntoString);
        }

        return Optional.empty();
    }

}
