package academy.everyonecodes.java.week6.set2.exercise4;

import java.util.List;

public class DigitSumCalculator {

    public int calculate(int number) {
        int sum = 0;
        if (isNegativeNumberOrBiggerThanMaxValue(number)) {
            return sum;
        }
        String numberParsedIntoString = String.valueOf(number);
        List<String> everySingleNumberInNumber = List.of(numberParsedIntoString.split(""));
        for (String singleNumber : everySingleNumberInNumber) {
            int numberInteger = Integer.parseInt(singleNumber);
            sum = sum + numberInteger;
        }
        return sum;
    }


    private boolean isNegativeNumberOrBiggerThanMaxValue(int number) {
        return number < 0;
    }
}
