package academy.everyonecodes.java.week10.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class MasterCard extends CreditCard {

    public MasterCard() {
        super("Mastercard");
    }

    @Override
    public boolean isCorrectCard(long creditCardNumber) {
        String numbersIntoString = String.valueOf(creditCardNumber);
        List<String> validators = List.of("51", "52", "53", "54", "55");
        Optional<String> oCardNumber = validators.stream()
                .filter(numbersIntoString::startsWith)
                .findFirst();

        return oCardNumber.isPresent() && numbersIntoString.length() == 16;
    }


}
