package academy.everyonecodes.java.es.interfaces.e4;

import java.util.List;

public class PhraseModifier {

    private List<Modifier> modifiers = List.of(new Spacer(), new Uppercaser());

    public void modified(Phrase phrase) {
        modifiers.stream()
                .forEach(e -> e.modify(phrase));
    }

}
