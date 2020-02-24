package academy.everyonecodes.java.week10.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class AmericanExpress extends CreditCard {

    public AmericanExpress() {
        super("AmericanExpress");
    }

    @Override
    public boolean isCorrectCard(long creditCardNumber) {
        String numbersIntoString = String.valueOf(creditCardNumber);
        List<String> validators = List.of("34", "37");
        Optional<String> oCardNumber = validators.stream()
                .filter(numbersIntoString::startsWith)
                .findFirst();

        return oCardNumber.isPresent() && numbersIntoString.length() == 15;
    }
}
