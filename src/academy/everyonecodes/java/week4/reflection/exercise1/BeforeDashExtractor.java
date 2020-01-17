package academy.everyonecodes.java.week4.reflection.exercise1;

import java.util.List;

public class BeforeDashExtractor {

    public static String extract(String word) {
        word.trim();
        String[] wordExtracted = word.split("-");
        String firstWordBeforeDash = wordExtracted[0];
        if (!word.contains("-")) {
            return "";
        } else {
            return firstWordBeforeDash;
        }
    }

}
