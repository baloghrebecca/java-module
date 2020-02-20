package academy.everyonecodes.java.week9.set2.exercise1;
import academy.everyonecodes.java.week9.set2.exercise1.Money.MoneyUnit;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChangeUnitsCalculator {

    public List<MoneyUnit> calculate(double moneyToGiveBack) {
        List<MoneyUnit> moneyToGiveBackList = new ArrayList<>();
        while (moneyToGiveBack >= 0.01) {
            Optional<MoneyUnit> oFindValue = getMoneyUnit(moneyToGiveBack);
            if (oFindValue.isPresent()) {
                MoneyUnit money = oFindValue.get();
                moneyToGiveBackList.add(money);
                moneyToGiveBack = BigDecimal.valueOf(moneyToGiveBack).subtract(BigDecimal.valueOf(money.getValue())).doubleValue();
                //both need to have .valueOf in order for it to work properly
            }
        }
        return moneyToGiveBackList;
    }

    private Optional<MoneyUnit> getMoneyUnit(double moneyToGiveBack) {
        return EuroUnits.get().stream()
                .filter(euro -> euro.getValue() <= moneyToGiveBack)
                .findFirst();
    }
}