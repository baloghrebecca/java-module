package academy.everyonecodes.java.es.ab.e3;

import academy.everyonecodes.java.es.ab.e3.Money.MoneyUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ChangeUnitsCalculator {
//BigDecimal.valueOf(money)/BigDecimal.valueOf(e.getValue())

    //   500<250 -> no
    //   200<450 -> yes! --> 450 - 200 -> 250
    //   100


    public List<MoneyUnit> calculate(double money) {
        List<MoneyUnit> moneyBack = new ArrayList<>();
        while(money > 0) {
            Optional<MoneyUnit> oValue = EuroUnits.get().stream()
                    .filter(getMoneyUnitPredicate(money))
                    .findFirst();
            if (oValue.isPresent()) {
                moneyBack.add(oValue.get());
                money = Double.parseDouble(getSubtract(money, oValue));
            }
        }


        return moneyBack;
    }

    String getSubtract(double money, Optional<MoneyUnit> oValue) {
        return String.valueOf(BigDecimal.valueOf(money).subtract(BigDecimal.valueOf(oValue.get().getValue())));
    }

    Predicate<MoneyUnit> getMoneyUnitPredicate(double money) {
        return moneyUnit -> moneyUnit.getValue() <= money;
    }


}
