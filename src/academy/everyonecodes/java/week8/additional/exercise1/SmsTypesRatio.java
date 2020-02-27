package academy.everyonecodes.java.week8.additional.exercise1;

import java.util.List;

public class SmsTypesRatio {

    private SmsReader smsReader = new SmsReader();
    private List<Sms> sms = smsReader.reader();


    public String ratio() {
        int ham = hamCounter();
        int spam = spamCounter();
        int totalSms = ham+spam;
        int hamPercent = (ham*100)/totalSms;
        int spamPercent = (spam*100)/totalSms;
        return "Ham/spam ratio: ham "+hamPercent+" spam "+spamPercent;
    }

    private int hamCounter() {
        Sorter hamSorter = new SmsHamSorter();
        return hamSorter.sort(sms).size();
    }

    private int spamCounter() {
        Sorter spamSorter = new SmsSpamSorter();
        return spamSorter.sort(sms).size();
    }

}
