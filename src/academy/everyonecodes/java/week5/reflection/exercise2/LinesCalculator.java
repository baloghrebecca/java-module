package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class LinesCalculator {

        public List<String> calculate(List<String> numberStrings) {
            StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();
            IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();
            List<String> sumsAsStrings = new ArrayList<>();
            for (String numberString : numberStrings ) {
                List<Integer> currentNumbers = stringToIntegersParser.parse(numberString);
                int sum = integerListSumCalculator.sum(currentNumbers);
                String sumIntoString = String.valueOf(sum);
                sumsAsStrings.add(sumIntoString);
            }
            return sumsAsStrings;
        }

}
