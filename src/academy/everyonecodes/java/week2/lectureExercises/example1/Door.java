package academy.everyonecodes.java.week2.lectureExercises.example1;

public class Door {

    private int code;
    private String keyPhrase;

    public Door(int code, String keyPhrase) {
        this.code = code;
        this.keyPhrase = keyPhrase;
    }

    public int getCode() {
        return code;
    }

    public String getKeyPhrase() {
        return keyPhrase;
    }
}
