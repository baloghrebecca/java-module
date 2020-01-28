package academy.everyonecodes.java.week6.set2.exercise1;


import java.util.List;

public class SpecialNumbersCounter {


    public int count(int number) {
        int counter = 0;
        if (isNegativeNumberOrBiggerThanMaxValue(number)) {
            return counter;
        }
        String numberParsedIntoString = String.valueOf(number);
        List<String> everySingleNumberInNumber = List.of(numberParsedIntoString.split(""));
        if (areSpecialNumbersContained(everySingleNumberInNumber)) {
            for (String singleNumber : everySingleNumberInNumber) {
                if (isSpecialNumber(singleNumber)) {
                    counter++;
                }
            }
        }
        return counter;
    }


    private boolean isSpecialNumber(String singleNumber) {
        return singleNumber.equals("3") || singleNumber.equals("6") || singleNumber.equals("9");
    }


    private boolean areSpecialNumbersContained(List<String> everySingleNumberInNumber) {
        return everySingleNumberInNumber.contains("3") || everySingleNumberInNumber.contains("6") || everySingleNumberInNumber.contains("9");
    }

    private boolean isNegativeNumberOrBiggerThanMaxValue(int number) {
        return number < 0;
    }

    //number >= Integer.MAX_VALUE -> will be called before the method, that's why it's not working

}

