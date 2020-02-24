package academy.everyonecodes.java.week10.set1.exercise1;

public class Validator {

    public boolean validate(String creditCardNumber) {

        int nDigits = creditCardNumber.length();

        int nSum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--) {

            int d = creditCardNumber.charAt(i) - '0';

            if (isSecond)
                d = d * 2;

            nSum += d / 10;
            nSum += d % 10;

            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);

    }

}

/*List<String> listOfNumbers = List.of(creditCardNumber.split(""));
        List<Integer> everySecondNumber = new ArrayList<>();
        for (int i = 0; i < creditCardNumber.length()+1; i++) {
            int number = Integer.parseInt(listOfNumbers.get(i+1));
            everySecondNumber.add(number);
        }
        int numbersMuliplyByTwoSum = everySecondNumber.stream()
                .map(n -> n * 2)
                .mapToInt(Integer::intValue)
                .sum();

        List<Integer> everyFirstNumber = new ArrayList<>();
        for (int i = -1; i < creditCardNumber.length()+1; i ++) {
            int number = Integer.parseInt(listOfNumbers.get(i+1));
            everySecondNumber.add(number);
        }
        int numbersSum = everyFirstNumber.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int numbersSumPlusSum = numbersSum + numbersMuliplyByTwoSum;
        return numbersSumPlusSum % 10 == 0; */