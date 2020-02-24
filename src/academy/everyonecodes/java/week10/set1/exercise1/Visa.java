package academy.everyonecodes.java.week10.set1.exercise1;

public class Visa extends CreditCard {


    public Visa() {
        super("Visa");
    }

    @Override
    public boolean isCorrectCard(long creditCardNumber) {
        String numbersIntoString = String.valueOf(creditCardNumber);
        return numbersIntoString.startsWith("4") && (numbersIntoString.length() == 16 || numbersIntoString.length() == 13);
    }
}
