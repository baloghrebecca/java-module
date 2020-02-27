package academy.everyonecodes.java.es.interfaces.e4;

public class Phrase {

    private String text;
    private String author;

    public Phrase(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public void setText(String text) {
        this.text = text;
    }
}
