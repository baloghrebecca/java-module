package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;

public class Increment {

    public List<Integer> incrementedByOne(int position, List<Integer> numbers) {
        ReplaceValue replace = new ReplaceValue();
        List<Integer> incrementedByOne = replace.replaceValue(numbers.get(position) + 1, position, numbers);
        return incrementedByOne;
    }

}
