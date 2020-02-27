package academy.everyonecodes.java.es.interfaces.e4;

public class Uppercaser implements Modifier{


    @Override
    public void modify(Phrase phrase) {
        String uppercased = phrase.getText().toUpperCase();
        phrase.setText(uppercased);
    }
}
