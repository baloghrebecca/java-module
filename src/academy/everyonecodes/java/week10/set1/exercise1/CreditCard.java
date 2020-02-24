package academy.everyonecodes.java.week10.set1.exercise1;

public abstract class CreditCard {

    public String creditCardName;

    public CreditCard(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public abstract boolean isCorrectCard(long creditCardNumber);


}
