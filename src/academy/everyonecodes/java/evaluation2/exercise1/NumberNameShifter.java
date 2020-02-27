package academy.everyonecodes.java.evaluation2.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberNameShifter {

    NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public List<String> shift(List<String> numbers) {
        List<String> numbersTransformed = numbers.stream()
                .map(numberToOptionalInt())
                .filter(Optional::isPresent)
                .map(numberPlusOne())
                .filter(numberInteger -> numberInteger < 9)
                .map(numberIntToNumberOptionalString())
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        if (numbersTransformed.isEmpty()) {
            return new ArrayList<>();
        }
        return numbersTransformed;
    }

    Function<Integer, Optional<String>> numberIntToNumberOptionalString() {
        return numberInteger -> dictionary.getName(numberInteger);
    }

    Function<Optional<Integer>, Integer> numberPlusOne() {
        return oNumberInteger -> oNumberInteger.get() + 1;
    }

    Function<String, Optional<Integer>> numberToOptionalInt() {
        return number -> dictionary.getNumber(number);
    }
}