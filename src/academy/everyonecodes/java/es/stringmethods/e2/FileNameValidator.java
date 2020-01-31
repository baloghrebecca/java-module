package academy.everyonecodes.java.es.stringmethods.e2;

public class FileNameValidator {
    public boolean validate(String word) {
        return word.startsWith("PHOTO_") && word.endsWith(".png");
    }
}
