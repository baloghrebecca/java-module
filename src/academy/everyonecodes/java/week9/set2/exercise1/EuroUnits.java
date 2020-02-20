package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.Money.*;

import java.util.List;

public class EuroUnits {

    public static List<MoneyUnit> get() {
        return List.of(
                new Euro200(),
                new Euro100(),
                new Euro50(),
                new Euro20(),
                new Euro10(),
                new Euro5(),
                new Euro2(),
                new Euro1(),
                new Cent50(),
                new Cent20(),
                new Cent10(),
                new Cent5(),
                new Cent2(),
                new Cent1()
        );
    }
}
