package academy.everyonecodes.java.week1.set1.exercise1;

public class DivideMethod {

    public static double divide(double numberOne, double numberTwo) {
        double quotient = numberOne / numberTwo;
        return quotient;
    }

    public static void main(String[] args) {

        double doubleOne = 1.1;
        double doubleTwo = 2.3;
        double quotient = divide(doubleOne, doubleTwo);
        System.out.println("The quotient is " + quotient);

    }


}
