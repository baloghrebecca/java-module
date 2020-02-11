package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {

    private List<Superhero> superheroes = List.of(new Batman(), new Spiderman(), new Superman());

    public Optional<Superhero> findSuperhero(String keyword) {
        return superheroes.stream()
                .filter(superhero -> superhero.getPrivateName().equalsIgnoreCase(keyword) || superhero.getSuperheroName().equalsIgnoreCase(keyword))
                .findFirst();
    }
}