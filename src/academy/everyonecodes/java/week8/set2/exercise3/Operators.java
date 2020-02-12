package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.List;

public class Operators {

    public static List<Operator> get() {
        return List.of(new Sum(), new Division(), new Multiplication(), new Subtraction());
    }

}
