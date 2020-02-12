package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.Objects;

public class Calculation {

        private String symbol;
        private double number1;
        private double number2;

    public Calculation(String symbol, double number1, double number2) {
        this.symbol = symbol;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculation that = (Calculation) o;
        return Double.compare(that.number1, number1) == 0 &&
                Double.compare(that.number2, number2) == 0 &&
                Objects.equals(symbol, that.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number1, number2);
    }
}
