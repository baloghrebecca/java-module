package academy.everyonecodes.java.es.ab.e2;

import java.util.List;

public class Discounts {


    public static List<DiscountProvider> get() {
        return List.of(new FiveOnWine(), new SevenOnSweets(), new TenOnVeggies());
    }

}
