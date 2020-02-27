package academy.everyonecodes.java.es.interfaces.e4;

import java.util.List;
import java.util.stream.Collectors;

public class Spacer implements Modifier {
    @Override
    public void modify(Phrase phrase) {
       List<String> characters = List.of(phrase.getText().split(""));
       String spaceAfterEveryCharacter = characters.stream()
               .filter(e -> !e.equals(" "))
               .collect(Collectors.joining(" "));
       phrase.setText(spaceAfterEveryCharacter);
    }
}
