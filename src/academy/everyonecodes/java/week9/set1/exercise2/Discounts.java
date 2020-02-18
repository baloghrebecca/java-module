package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Discounts {

    public static List<Discount> get() {
        return List.of(
                new FiveOnWine(),
                new SevenOnSweets(),
                new TenOnVeggies()
        );
    }
}

