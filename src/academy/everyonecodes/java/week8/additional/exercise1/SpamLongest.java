package academy.everyonecodes.java.week8.additional.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SpamLongest {

    SmsReader smsReader = new SmsReader();
    private List<Sms> sms = smsReader.reader();

    public int longestSpam() {
        Sorter spamSorter = new SmsSpamSorter();
        List<Sms> spam = spamSorter.sort(sms);
        List<Integer> counter = spam.stream()
                .map(e -> e.getContent().length())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return counter.get(0);
    }

}
