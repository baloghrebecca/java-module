package academy.everyonecodes.java.week8.additional.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class SmsHamSorter implements Sorter {

    @Override
    public List<Sms> sort(List<Sms> sms) {
        return sms.stream()
                .filter( e -> e.getType().equalsIgnoreCase("ham"))
                .collect(Collectors.toList());
    }
}
