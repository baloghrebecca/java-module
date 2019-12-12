package academy.everyonecodes.java.week1.set2.exercise3;

import java.util.List;

public class CompareNumber {

    public static boolean isBigger(int number1, int number2) {
        boolean isBigger = false;
        if (number1 > number2) {
            isBigger = true;
        }
        return isBigger;
    }

    public static boolean isSmaller(int number1, int number2) {
        boolean isSmaller = false;
        if (number1 < number2) {
            isSmaller = true;
        }
        return isSmaller;
    }

    public static int getBiggest(List<Integer> numbers) {
        int numberBiggest = numbers.get(0);
        int counter = 0;
        int numberSize = numbers.size();
        while (counter < numberSize) {
            int number = numbers.get(counter);
            if (isBigger(number, numberBiggest)) {
                numberBiggest = number;
            }
            counter++;
        }
        return numberBiggest;
    }

    public static int getSmallest(List<Integer> numbers) {
        int numberSmallest = numbers.get(0);
        int counter = 1;
        int numberSize = numbers.size();
        while (counter < numberSize) {
            int number = numbers.get(counter);
            if (isSmaller(number, numberSmallest)) {
                numberSmallest = number;
            }
            counter++;
        }
        return numberSmallest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 4, 3, 0, 5, 2);
        int numberBiggest = getBiggest(numbers);
        int numberSmallest = getSmallest(numbers);
        System.out.println(numberBiggest);
        System.out.println(numberSmallest);
    }
}
