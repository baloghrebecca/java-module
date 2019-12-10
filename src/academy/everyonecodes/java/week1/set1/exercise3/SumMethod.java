package academy.everyonecodes.java.week1.set1.exercise3;

public class SumMethod {

    public static int sumInt(int numberOne, int numberTwo){
        int sumOne = numberOne + numberTwo;
        return sumOne;
    }

    public static double sumDouble(double numberOne,double numberTwo) {
        double sumTwo = numberOne + numberTwo;
        return sumTwo;
    }

    public static void main(String[] args) {

        int numberOne = 2;
        int numberTwo = 3;
        double numberDoubleOne = 2.2;
        double numberDoubleTwo = 1.3;

        int intSum = sumInt(numberOne,numberTwo);
        double doubleSum = sumDouble(numberDoubleOne, numberDoubleTwo);

        System.out.println("The int sum is " + intSum);
        System.out.println("The double sum is "+ doubleSum);
   }

}
