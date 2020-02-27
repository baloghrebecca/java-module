package academy.everyonecodes.java.week8.additional.exercise1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostHamWord {

    SmsReader smsReader = new SmsReader();
    private List<Sms> sms = smsReader.reader();
    private List<String> punctio = List.of("\'", "!", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~");

    public String wordMostUsed() {
        Sorter hamSorter = new SmsHamSorter();
        List<Sms> ham = hamSorter.sort(sms);
        List<String> content = ham.stream()
                .map(Sms::getContent)
                .collect(Collectors.toList());
        List<String> contentWithoutPunctio = getContentWithoutPunctio(content);

        List<String> allWords = getAllWords(contentWithoutPunctio);
        Map<String, Long> result =
                allWords.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));


        Map<String, Long> finalMap = new LinkedHashMap<>();
        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        Map.Entry<String, Long> entry = finalMap.entrySet().iterator().next();

        return entry.getKey();
    }


    List<String> getAllWords(List<String> contentWithoutPunctio) {
        return contentWithoutPunctio.stream()
                .map(String::toLowerCase)
                .map(e -> List.of(e.split(" ")))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    List<String> getContentWithoutPunctio(List<String> content) {
        return content.stream()
                .map(this::remove)
                .collect(Collectors.toList());
    }


    String remove(String line) {
        return punctio.stream()
                .filter(line::contains)
                .map(l -> line.replace(l, ""))
                .collect(Collectors.joining());

    }
}


