package academy.everyonecodes.java.week10.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class Card {

    private List<CreditCard> creditCards = List.of(new MasterCard(), new Visa(), new AmericanExpress());
    private Validator validator = new Validator();

    public String checker(String creditCardNumber) {

        boolean isValid = validator.validate(creditCardNumber);

        if (isValid) {
            Optional<CreditCard> oRightCard = creditCards.stream()
                    .filter(c -> c.isCorrectCard(Long.parseLong(creditCardNumber)))
                    .findFirst();
            if (oRightCard.isPresent()) {
                return oRightCard.get().getCreditCardName();
            }

        }

        return "Invalid";
    }

}
