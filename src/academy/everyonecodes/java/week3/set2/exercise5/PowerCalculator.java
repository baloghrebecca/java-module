package academy.everyonecodes.java.week3.set2.exercise5;

public class PowerCalculator {
    public double calculate(double numberOne, double numberTwo) {

        double result = 1.00;

        for (int i = 0; i < numberTwo; i++) {
            result = result * numberOne;
        }

        return result;
    }
}
