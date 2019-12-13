package academy.everyonecodes.java.week1.reflection.exercise1;

public class Power {
    public static int raiseToPower(int number1, int number2) {
       int numberPower = number1;
       int counter = 1;
       while (counter < number2) {
           numberPower = numberPower*number1;
           counter++;
       }
       return numberPower;
    }

    public static void main(String[] args) {
        int numberPower = raiseToPower(2,5);
        System.out.println(numberPower);
    }

}
