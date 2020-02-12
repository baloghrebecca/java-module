package academy.everyonecodes.java.week8.set2.exercise3;

public class Multiplication implements Operator{


    @Override
    public String getSymbol() {
        return "*";
    }

    @Override
    public double operate(double number1, double number2) {
        return number1*number2;
    }
}
