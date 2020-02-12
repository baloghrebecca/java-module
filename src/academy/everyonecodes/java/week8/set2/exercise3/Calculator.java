package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.List;
import java.util.Optional;

public class Calculator {

    private List<Operator> operators = Operators.get();

    public Optional<Double> calculate(Calculation calculation) {
        return operators.stream()
                .filter(operator -> operator.getSymbol().equalsIgnoreCase(calculation.getSymbol()))
                .map(operator -> operator.operate(calculation.getNumber1(), calculation.getNumber2()))
                .findFirst();
    }

}
