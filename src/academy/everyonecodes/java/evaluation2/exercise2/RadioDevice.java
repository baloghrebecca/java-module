package academy.everyonecodes.java.evaluation2.exercise2;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class RadioDevice {

    private List<RadioAntenna> radioAntennaList = List.of(new Antenna3G(), new Antenna5G());

    public Optional<String> receive(RadioMessage radioMessage) {
        return radioAntennaList.stream()
                .filter(isSameFrequency(radioMessage))
                .map(getRadioMessageContent(radioMessage))
                .findFirst();
    }

    Function<RadioAntenna, String> getRadioMessageContent(RadioMessage radioMessage) {
        return radioMessageContent -> radioMessage.getContent();
    }

    Predicate<RadioAntenna> isSameFrequency(RadioMessage radioMessage) {
        return radioAntenna -> radioAntenna.getFrequency() == radioMessage.getFrequency();
    }
}
