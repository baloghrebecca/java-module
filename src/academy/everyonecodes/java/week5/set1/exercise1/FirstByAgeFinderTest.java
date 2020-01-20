package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.Optional;

class FirstByAgeFinderTest {

    FirstByAgeFinder firstByAgeFinder = new FirstByAgeFinder();

    @Test

    void ageFinderWithTheAgeIncluded () {
        Person person = new Person("Andrea", 12);
        Person personTwo = new Person("Rebecca", 15);
        List<Person> personList1 = List.of(person, personTwo);
        Optional<Person> oResult = firstByAgeFinder.find(personList1, 12);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(person, oResult.get());

    }

    @Test

    void ageFinderWithTheNotIncluded() {
        Person person = new Person("Andrea", 12);
        Person personTwo = new Person("Rebecca", 15);
        List<Person> personList1 = List.of(person, personTwo);
        Optional<Person> oResult = firstByAgeFinder.find(personList1, 14);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void ageFinderWithOnlyOnePersonInTheList() {
        Person person = new Person("Andrea", 12);
        List<Person> personList1 = List.of(person);
        Optional<Person> oResult = firstByAgeFinder.find(personList1, 12);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(person, oResult.get());
    }

    @Test
    void ageFinderWithEmptyList() {
        Person person = new Person("Andrea", 12);
        List<Person> personList1 = List.of();
        Optional<Person> oResult = firstByAgeFinder.find(personList1, 12);
        Assertions.assertTrue(oResult.isEmpty());
    }

}
