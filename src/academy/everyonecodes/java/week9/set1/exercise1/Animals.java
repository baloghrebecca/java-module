package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.*;

import java.util.List;

public class Animals {


    public static List<Animal> get() {


        return List.of(
                new Mammal("dog", List.of("walk","run"), "brown"),
                new Mammal("gorilla", List.of("walk", "run", "climb"), "black"),
                new Bird("goose", List.of("walk","fly","swim"), "white"),
                new Bird("sparrow", List.of("jump","fly"), "brown"),
                new Fish("salmon", List.of("swim"), "saltwater"),
                new Fish("angelfish", List.of("swim"), "freshwater"),
                new Reptile("snake", List.of("crawl","climb"), false),
                new Reptile("turtle", List.of("crawl"), true),
                new Amphibian("frog", List.of("walk","jump","swim"), true),
                new Amphibian("caecilian", List.of("crawl","swim"), false),
                new Arthropod("spider", List.of("walk","climb"), 8),
                new Arthropod("butterfly", List.of("walk","climb","fly"), 6));

    }


}
